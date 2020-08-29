package main.java.com.vz89.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведены в массив";
        byte[] buf = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи в буфер");
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte[] b = f.toByteArray();
        for (byte value : b) System.out.print((char) value);

        System.out.println("Поток вывода типа OutputStream()");
        try (FileOutputStream f2 = new FileOutputStream("test.txt"))
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
