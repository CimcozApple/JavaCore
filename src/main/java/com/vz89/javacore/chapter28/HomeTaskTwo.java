package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HomeTaskTwo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        CompletableFuture.runAsync(() -> {
            fizzBuzz.fizz(() -> {
            });
        }, executorService);
        CompletableFuture.runAsync(() -> {
            fizzBuzz.buzz(() -> {
            });
        }, executorService);
        CompletableFuture.runAsync(() -> {
            fizzBuzz.number(() -> {
            });
        }, executorService);
        CompletableFuture.runAsync(() -> {
            fizzBuzz.fizzbuzz(() -> {
            });
        }, executorService);
    }
}

class FizzBuzz {
    int n;
    int number = 1;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz(Runnable r) {
        lock.lock();
        while (number <= n) {
            if (number % 3 == 0 && number % 5 > 0) {
                r.run();
                System.out.print("fizz");
                number++;
                condition.signalAll();
            } else {
                try {
                    condition.signalAll();
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        lock.unlock();
    }

    public void buzz(Runnable r) {
        lock.lock();
        while (number <= n) {
            if (number % 5 == 0 && number % 3 > 0) {
                r.run();
                System.out.print("buzz");
                number++;
                condition.signalAll();
            } else try {
                condition.signalAll();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }

    public void fizzbuzz(Runnable r) {
        lock.lock();
        while (number <= n) {
            if (number % 5 == 0 && number % 3 == 0) {
                r.run();
                System.out.print("fizzbuzz");
                number++;
                condition.signalAll();
            } else try {
                condition.signalAll();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }

    public synchronized void number(Runnable r) {
        lock.lock();
        while (number <= n) {
            if (number % 5 > 0 && number % 3 > 0) {
                r.run();
                System.out.print(number);
                number++;
                condition.signalAll();
            } else try {
                condition.signalAll();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.unlock();
    }
}


