package main.java.com.vz89.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }
        catch (ArithmeticException e) {
            System.out.println("Этот код недостижим");
        }
        catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }

    }
}
