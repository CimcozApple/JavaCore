package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Foo {
    Semaphore semaphore = new Semaphore(3);
    int num = 3;
    int i = 1;

    public void first(Runnable r) {
        while (i <= num) {
            if (semaphore.availablePermits() == 3) {
                r.run();
                System.out.print("first");
                i++;
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void second(Runnable r) {
        while (i <= num) {
            if (semaphore.availablePermits() == 2) {
                r.run();
                System.out.print("second");
                i++;
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void third(Runnable r) {
        while (i <= num) {
            if (semaphore.availablePermits() == 1) {
                r.run();
                System.out.print("third");
                i++;
                try {
                    semaphore.acquire();
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

        CompletableFuture.runAsync(() -> foo.second(() -> {}),executorService);
        CompletableFuture.runAsync(() -> foo.third(() -> {}),executorService);
        CompletableFuture.runAsync(() -> foo.first(() -> {}),executorService);

    }
}



