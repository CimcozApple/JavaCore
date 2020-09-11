package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");

        new MyThread1(cyclicBarrier,"A");
        new MyThread1(cyclicBarrier,"B");
        new MyThread1(cyclicBarrier,"C");
        new MyThread1(cyclicBarrier,"X");
        new MyThread1(cyclicBarrier,"T");
        new MyThread1(cyclicBarrier,"Z");
    }
}
class MyThread1 implements Runnable{
    CyclicBarrier cyclicBarrier;
    String name;

    public MyThread1(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}
