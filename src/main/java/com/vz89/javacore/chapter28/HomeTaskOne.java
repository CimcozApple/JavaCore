package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Foo {
    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}

public class HomeTaskOne {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Foo foo = new Foo();
        A a = new A(foo);

        executorService.execute(new A(foo));
        executorService.execute(new B(foo));
        executorService.execute(new C(foo));

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

    @Override
    public void run() {
        foo.second();
    }

    public B(Foo foo) {
        this.foo = foo;
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