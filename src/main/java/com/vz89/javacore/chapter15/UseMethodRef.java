package main.java.com.vz89.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    private int val;
    MyClass (int v) {
        val = v;
    }
    int getVal() {
        return val;
    }
}

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> a = new ArrayList<>();
        a.add(new MyClass(1));
        a.add(new MyClass(4));
        a.add(new MyClass(2));
        a.add(new MyClass(9));
        a.add(new MyClass(3));
        a.add(new MyClass(7));

        MyClass maxValObj = Collections.max(a,UseMethodRef::compareMC);

        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }

}
