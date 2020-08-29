package main.java.com.vz89.javacore.chapter20;

import java.io.*;

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("hello", 1, 0.5);
            System.out.println("object1: " + object1);
            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass)objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
