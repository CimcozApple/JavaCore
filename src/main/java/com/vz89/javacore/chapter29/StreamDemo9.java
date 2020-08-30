package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Бетта");
        list.add("Альфа");
        list.add("Эта");
        list.add("Гамма");
        list.add("Эпсилон");
        list.add("Омега");

        Stream<String> myStream = list.stream();
        Spliterator<String> itr = myStream.spliterator();
        while (itr.tryAdvance(System.out::println));
    }

}
