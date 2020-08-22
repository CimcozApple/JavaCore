package main.java.com.vz89.javacore.chapter10;

public class ThrowDemo {
    private static void demoProc() {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc()." + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
