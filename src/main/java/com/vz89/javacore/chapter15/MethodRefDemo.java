package main.java.com.vz89.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyStringOps {
    static String strReverse (String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo {
    static String stringOP(StringFunc2 stringFunc2, String s) {
        return stringFunc2.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбла-выражения повышают эффективность Java";
        String outStr;

        outStr = stringOP(MyStringOps::strReverse,inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }

}
