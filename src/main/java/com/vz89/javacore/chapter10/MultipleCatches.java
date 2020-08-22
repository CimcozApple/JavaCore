package main.java.com.vz89.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексции за пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch");
    }
}
