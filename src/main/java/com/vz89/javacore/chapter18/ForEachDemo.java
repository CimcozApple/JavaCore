package main.java.com.vz89.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.println("Исходнео содержание списочного массива vals: ");
        for (int v : vals) System.out.println(v + " ");
        System.out.println();

        int sum = 0;
        for (int v : vals) sum += v;

        System.out.println("Сумма численных значений: " + sum);



    }

}
