package main.java.com.vz89.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("Исходное содержимое списочного массива al: ");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            if (element.equals("A")) litr.add("element" + " 1");
            else litr.set(element + "+");
        }

        System.out.println("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();

        //litr = al.listIterator(al.size());

        System.out.println("Измененный в обратном порядке список: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
