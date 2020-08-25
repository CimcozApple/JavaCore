package main.java.com.vz89.javacore.chapter15;

interface MyFunc4 {
    MyClass1 func(int n);
}

class MyClass1 {
    private int val;

    MyClass1(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myFunc4 = MyClass1::new;
        MyClass1 myClass1 = myFunc4.func(100);
        System.out.println("Значение val в объекте mc равно " + myClass1.getVal());
    }


}
