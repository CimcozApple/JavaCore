package main.java.com.vz89.javacore.chapter11;

class NewThread1 extends Thread {

    NewThread1() {
        super("Demo thread");
        System.out.println("Дочерний поток создан " + this);
        start();
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

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();
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
