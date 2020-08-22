package main.java.com.vz89.javacore.chapter10;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
