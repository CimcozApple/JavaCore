package main.java.com.vz89.javacore.chapter11;

class NewThread3 implements Runnable {
    Thread t;
    String name;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, "Demo thread");
        System.out.println("Новый поток" + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(name + " прерван");
            }
        }
        System.out.println(name + " завершен");
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 one = new NewThread3("one");
        NewThread3 two = new NewThread3("two");
        NewThread3 three = new NewThread3("three");

        System.out.println("Поток one запущен" + one.t.isAlive());
        System.out.println("Поток two запущен" + two.t.isAlive());
        System.out.println("Поток three запущен" + three.t.isAlive());

        try{
            System.out.println("Ожидание завершения потоков");
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток one запущен" + one.t.isAlive());
        System.out.println("Поток two запущен" + two.t.isAlive());
        System.out.println("Поток three запущен" + three.t.isAlive());

        System.out.println("Главгый поток завершен");
    }

}
