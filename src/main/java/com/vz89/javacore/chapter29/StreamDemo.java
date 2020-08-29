package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходные список: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);

        minVal.ifPresent(s -> System.out.println("Минимальное значение: " + s));

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(s -> System.out.println("Максимальное значние: " + s));

        Stream<Integer> sortedStream = myList.stream().sorted();

        System.out.print("Отсортированный поток данных: ");
        sortedStream.forEach(s -> System.out.print(s + " "));

        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> n % 2 == 1);
        System.out.println("Нечетные значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter(n -> n % 2 == 1)
                .filter(n -> n > 5);

        System.out.println("Нечетные значения > 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));

    }
}
