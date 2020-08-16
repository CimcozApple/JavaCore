package main.java.com.vz89.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("Содержимое списочного массива vals: \n");
        Spliterator<Double> spliterator = vals.spliterator();
        while(spliterator.tryAdvance(System.out::println));

        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spliterator.tryAdvance(n->sqrs.add(Math.sqrt(n))));

        System.out.println("Содержимое списочного массива sqrs: \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining(System.out::println);

    }
}
