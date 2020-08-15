package main.java.com.vz89.javacore.chapter18;

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(15,0.75f,true){
            {
                put(1, "obj1");
                put(15, "obj15");
                put(4, "obj4");
                put(38, "obj38");
            }
        };
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(1));
        System.out.println(linkedHashMap);
        for (Map.Entry<Integer, String> a:linkedHashMap.entrySet()){
            System.out.println(a.getValue());
            System.out.println(a.getKey());
        }
    }
}
