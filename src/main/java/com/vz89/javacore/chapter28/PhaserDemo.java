package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("запуск потоков");

        new NewThread(phaser,"A");
        new NewThread(phaser,"B");
        new NewThread(phaser,"C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) System.out.println("Синхронизатор фаз завершен");
    }
}

class NewThread implements Runnable {
    Phaser phaser;
    String name;

    public NewThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(" Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Поток " + name + " начинает вторую фазу");
        phaser.arriveAndDeregister();
    }
}