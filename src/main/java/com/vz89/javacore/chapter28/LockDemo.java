package main.java.com.vz89.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread("A",lock);
        new LockThread("B",lock);
    }
}
class Shared1 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " ожидает блокировки счетчика");
        lock.lock();
        System.out.println("Поток " + name + " блокирует счетчик");
        Shared1.count++;
        System.out.println("Поток " + name + " :" + Shared1.count);
        System.out.println("Поток " + name + " ожидает");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }


    }
}