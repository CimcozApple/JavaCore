package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходные список: " + myList);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        productObj.ifPresent(System.out::println);

        int evenProduct = myList.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });
        System.out.println(evenProduct);

        Optional<Integer> productObj1 = myList.parallelStream().reduce((a, b) -> a * b);
        System.out.println(productObj1.get());

        int parallelProduct = myList.parallelStream().reduce(1,(a,b) -> a*b, (a,b) -> a*b);
        System.out.println(parallelProduct);

    }
}
