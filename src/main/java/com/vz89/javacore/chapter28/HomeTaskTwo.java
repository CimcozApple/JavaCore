package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeTaskTwo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
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

    public FizzBuzz(int n) {
        this.n = n;
    }

    public synchronized void fizz() {
        while (number <= n) {
            if (number % 3 == 0 && number % 5 > 0) {
                System.out.print("fizz");
                number++;
                notifyAll();
            } else try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void buzz() {
        while (number <= n) {
            if (number % 5 == 0 && number % 3 > 0) {
                System.out.print("buzz");
                number++;
                notifyAll();
            } else try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void fizzbuzz() {
        while (number <= n) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.print("fizzbuzz");
                number++;
                notifyAll();
            } else try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void number() {
        while (number <= n) {
            if (number % 5 > 0 && number % 3 > 0) {
                System.out.print(number);
                number++;
                notifyAll();
            } else try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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

