package main.java.com.vz89.javacore.chapter15;

interface MyFunc1<T> {
    MyClass2<T> func(T n);
}

class MyClass2<T> {
    private T val;

    MyClass2(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc1<Integer> myClassCons = MyClass2<Integer>::new;
        MyClass2 myClass2 = myClassCons.func(10);
        System.out.println("Значение val в объекте mc равно " + myClass2.getVal());


    }

}
