package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");
        new MyThread(countDownLatch);

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнения");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch countDownLatch) {
        latch = countDownLatch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i=1000; i>0 ;i--) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
