package main.java.com.vz89.javacore.chapter11;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this,"Demo thread");
        System.out.println("Дочерний поток создан " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i>0 ;i--) {
            System.out.println("Дочерний поток " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Дочерний поток прерван");
            }
        }
        System.out.println("Дочерний поток завершен");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        for (int i = 5; i>0 ;i--) {
            System.out.println("Главный поток " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Главный поток прерван");
            }
        }
        System.out.println("Главный поток завершен");


    }
}
