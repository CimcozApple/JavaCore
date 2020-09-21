package main.java.com.vz89.javacore;

public class test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getX());
    }

}
class A {
    private int x=1;


    public int getX() {
        return x;
    }

}

class B extends A{

}