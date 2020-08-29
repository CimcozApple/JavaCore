package main.java.com.vz89.javacore.chapter20;

import java.io.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char[] buf = new char[s.length()];
        s.getChars(0,s.length(),buf,0);

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи в буфер");
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        char[] c = f.toCharArray();
        for (char value : c) System.out.print(value);

        System.out.println("Поток вывода типа FileWriter()");
        try (FileWriter f2 = new FileWriter("testwr.txt"))
        {
            f.writeTo(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i = 0; i<3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
