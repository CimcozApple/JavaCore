package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7d);
        myList.add(18d);
        myList.add(10d);
        myList.add(24d);
        myList.add(17d);
        myList.add(5d);

        double productOfSqrRoots = myList.parallelStream().reduce(1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b
        );

        System.out.println(productOfSqrRoots);
    }
}
