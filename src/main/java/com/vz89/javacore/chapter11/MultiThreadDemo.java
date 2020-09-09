package main.java.com.vz89.javacore.chapter11;

class NewThread2 implements Runnable {
    String name;
    Thread t;

    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(name + " прерван");
            }
        }
        System.out.println(name + " завершен");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("one");
        new NewThread2("two");
        new NewThread2("three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
