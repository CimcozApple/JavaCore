package main.java.com.vz89.javacore.chapter18;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HomeTaskOne {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(findIndexesBySumInArray(new Integer[]{3, 8, 15, 17}, 23)));

        findDublicateInArray(new Integer[]{4, 5, 6, 6, 8});
        findDublicateInArray(new Integer[]{4, 5, 6, 7, 8});
    }


    public static Integer[] findIndexesBySumInArray(Integer[] array, int sum) {
        int idx = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer i : array) {
            map.put(i, idx++);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.containsKey(sum - entry.getKey())) {
                return new Integer[]{entry.getValue(), map.get(sum - entry.getKey())};
            }
        }
        return null;
    }

    public static boolean findDublicateInArray(Integer[] array) {
        for (Integer i : array) {
            int repeat = Collections.frequency(Arrays.asList(array), i);
            if (repeat > 1) {
                return true;
            }
        }
        System.out.println("Дубликатов нет");
        return false;
    }


}
