package main.java.com.vz89.javacore.chapter11;

class A {
    synchronized void foo(B b) {

        System.out.println(Thread.currentThread().getName() + " вощел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " пытается вызвать метод B.last");
        b.last();
    }

    synchronized  void last() {
        System.out.println("B методе A.last()");
    }
}

class B {
    synchronized void bar (A a) {
        System.out.println(Thread.currentThread().getName() + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " пытается вызвать метод A.last()");
        a.last();

    }
    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}


public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();
        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        String a = "abc";
        a = "asasg";

        new Deadlock();
    }
}
