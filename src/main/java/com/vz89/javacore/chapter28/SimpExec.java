package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch countDownLatch1 = new CountDownLatch(5);
        CountDownLatch countDownLatch2 = new CountDownLatch(5);
        CountDownLatch countDownLatch3 = new CountDownLatch(5);
        CountDownLatch countDownLatch4 = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new MyThread2(countDownLatch1,"A"));
        executorService.execute(new MyThread2(countDownLatch2,"B"));
        executorService.execute(new MyThread2(countDownLatch3,"C"));
        executorService.execute(new MyThread2(countDownLatch4,"D"));

        try {
            countDownLatch1.await();
            countDownLatch2.await();
            countDownLatch3.await();
            countDownLatch4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Завершение потоков");

    }
}

class MyThread2 implements Runnable{
    String name;
    CountDownLatch latch;

    public MyThread2(CountDownLatch latch,String name) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run () {
        for (int i=0;i<5;i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}