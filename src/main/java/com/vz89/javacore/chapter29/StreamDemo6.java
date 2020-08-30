package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.1);
        arrayList.add(3.6);
        arrayList.add(9.2);
        arrayList.add(4.7);
        arrayList.add(12.1);
        arrayList.add(5.0);

        System.out.println("Исходные значения из списка arrayList: ");
        arrayList.stream().forEach(aDouble -> System.out.println(aDouble + " "));
        System.out.println();

        IntStream cStrm = arrayList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.println("Максимально допустимые пределы значений: ");
        cStrm.forEach(value -> System.out.println(value + " "));

    }

}
