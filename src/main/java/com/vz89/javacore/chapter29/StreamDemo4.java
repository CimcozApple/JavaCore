package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7d);
        myList.add(18d);
        myList.add(10d);
        myList.add(24d);
        myList.add(17d);
        myList.add(5d);

        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);
        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0,(a,b) -> a*b);
        System.out.println("Приведение квадратных корней равно " + productOfSqrtRoots);


    }
}
