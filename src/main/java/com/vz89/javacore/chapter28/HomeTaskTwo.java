package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HomeTaskTwo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.execute(new Aclass(fizzBuzz));
        executorService.execute(new Bclass(fizzBuzz));
        executorService.execute(new Cclass(fizzBuzz));
        executorService.execute(new Dclass(fizzBuzz));

        executorService.shutdown();
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

    public void fizz() {
        lock.lock();
        while (number <= n) {
            if (number % 3 == 0 && number % 5 > 0) {
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

    public void buzz() {
        lock.lock();
        while (number <= n) {
            if (number % 5 == 0 && number % 3 > 0) {
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

    public void fizzbuzz() {
        lock.lock();
        while (number <= n) {
            if (number % 5 == 0 && number % 3 == 0) {
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

    public synchronized void number() {
        lock.lock();
        while (number <= n) {
            if (number % 5 > 0 && number % 3 > 0) {
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

class Aclass implements Runnable {
    private FizzBuzz fizzBuzz;

    public Aclass(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        fizzBuzz.fizz();
    }
}

class Bclass implements Runnable {
    private FizzBuzz fizzBuzz;

    public Bclass(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        fizzBuzz.buzz();
    }
}

class Cclass implements Runnable {
    private FizzBuzz fizzBuzz;

    public Cclass(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        fizzBuzz.fizzbuzz();
    }
}

class Dclass implements Runnable {
    private FizzBuzz fizzBuzz;

    public Dclass(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        fizzBuzz.number();
    }
}

