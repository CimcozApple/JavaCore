package main.java.com.vz89.javacore.chapter20;

public class PrintFDemo {
    public static void main(String[] args) {
        System.out.println("Ниже приведены некоторые числовые значения в разных форматах.");

        System.out.printf("Разные целочисленные форматы ");
        System.out.printf("%d %(d %+d %05d\n)",3,-3,3,3);
        System.out.println();
        System.out.printf("Формат числе с плавающей точкой: %f\n",1234567.122);
        System.out.printf("Формат числе с плавающей точкой, разделяемых запятыми: %,f\n",1234567.122);
        System.out.printf("Формат числе с плавающей точкой по умолчанию: %,f\n",-1234567.122);
        System.out.printf("Другой формат отрицательных чисел с плавающей точкой : %,(f\n",-1234567.122);

        System.out.println();


    }
}
