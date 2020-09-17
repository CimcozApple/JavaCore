package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Foo {
    int num = 3;
    int i = 1;

    public synchronized void first() {
        while (i <= num) {
            if (i == 1) {
                System.out.print("first");
                i++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void second() {
        while (i <= num) {
            if (i == 2) {
                System.out.print("second");
                i++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void third() {
        while (i <= num) {
            if (i == 3) {
                System.out.print("third");
                i++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class HomeTaskOne {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new C(foo));
        executorService.execute(new B(foo));
        executorService.execute(new A(foo));


        executorService.shutdown();
    }
}

class A implements Runnable {
    Foo foo;

    public A(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.first();
    }
}

class B implements Runnable {
    Foo foo;

    public B(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.second();
    }
}

class C implements Runnable {
    Foo foo;

    public C(Foo foo) {
        this.foo = foo;
    }

    @Override
    public void run() {
        foo.third();
    }
}