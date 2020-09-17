package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

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
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Phaser phaser = new Phaser(1) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                if (phase == 2 || registeredParties == 0) return true;
                return false;
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new B(foo, phaser));
        executorService.execute(new A(foo, phaser));
        executorService.execute(new C(foo, phaser));

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
        executorService.shutdown();
    }
}

class A implements Runnable {
    Foo foo;
    Phaser phaser;

    public A(Foo foo, Phaser phaser) {
        this.foo = foo;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            if (phaser.getPhase() == 0) {
                foo.first();
                phaser.arriveAndDeregister();
                break;
            } else phaser.arriveAndAwaitAdvance();
        }
    }
}

class B implements Runnable {
    Foo foo;
    Phaser phaser;

    public B(Foo foo, Phaser phaser) {
        this.foo = foo;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            if (phaser.getPhase() == 1) {
                foo.second();
                phaser.arriveAndDeregister();
                break;
            } else phaser.arriveAndAwaitAdvance();
        }
    }
}

class C implements Runnable {
    Foo foo;
    Phaser phaser;

    public C(Foo foo, Phaser phaser) {
        this.foo = foo;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            if (phaser.getPhase() == 2) {
                foo.third();
                phaser.arriveAndDeregister();
                break;
            } else phaser.arriveAndAwaitAdvance();
        }
    }
}