package main.java.com.vz89.javacore.chapter15;

interface StringFunc3 {
    String func(String n);
}

class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo2 {
    static String stringOP(StringFunc3 stringFunc3, String s) {
        return stringFunc3.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбла-выражения повышают эффективность Java";
        String outStr;
        MyStringOps2 myStringOps2 = new MyStringOps2();

        outStr = stringOP(myStringOps2::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }
}
