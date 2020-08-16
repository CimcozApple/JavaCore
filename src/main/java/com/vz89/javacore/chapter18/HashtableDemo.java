package main.java.com.vz89.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;

class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John Dow", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralf Smith", -19.08);

        names = balance.keys();
        while(names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("John Dow");
        balance.put("John Dow", bal + 1000);
        System.out.println("Новый остаток на счете John Dow: " + balance.get("John Dow"));

    }

}
