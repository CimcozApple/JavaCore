package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " + phase + " завершена.\n");
        if (phase == numPhases || registeredParties == 0) return true;
        return false;
    }
}

class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new NewNewThread(phaser, "A");
        new NewNewThread(phaser, "B");
        new NewNewThread(phaser, "C");

        while (!phaser.isTerminated()){
            phaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");

    }
}

class NewNewThread implements Runnable {
    Phaser phaser;
    String name;

    public NewNewThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
