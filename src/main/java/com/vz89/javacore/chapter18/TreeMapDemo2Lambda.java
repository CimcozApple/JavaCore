package main.java.com.vz89.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2Lambda {
    public static void main(String[] args) {
        TreeMap<String, Double> hm = new TreeMap<>((aStr, bStr) -> {
            int i, j, k;
            i = aStr.lastIndexOf(' ');
            j = bStr.lastIndexOf(' ');
            k = aStr.substring(i).compareTo(bStr.substring(j));
            if (k == 0) return aStr.compareTo(bStr);
            else return k;
        });

        hm.put("John Dow", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralf Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("John Dow");
        hm.put("John Dow", balance + 1000);
        System.out.println("Новый остаток на счету Джона: " + hm.get("John Dow"));
    }
}


