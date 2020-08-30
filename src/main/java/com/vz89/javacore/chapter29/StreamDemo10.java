package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Бетта");
        list.add("Альфа");
        list.add("Эта");
        list.add("Гамма");
        list.add("Эпсилон");
        list.add("Омега");

        Stream<String> myStream = list.stream();
        Spliterator<String> splitItr = myStream.spliterator();
        Spliterator<String> splitItr2 =splitItr.trySplit();
        if (splitItr2 != null) {
            System.out.println("Spliterator 2 result:");
            splitItr2.forEachRemaining(System.out::println);
        }

        System.out.println("Spliterator result");
        splitItr.forEachRemaining(System.out::println);
    }
}
