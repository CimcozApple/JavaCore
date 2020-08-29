package main.java.com.vz89.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test.dat"))) {
            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);

            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.dat"))) {
                double d = dataInputStream.readDouble();
                int i = dataInputStream.readInt();
                boolean b = dataInputStream.readBoolean();
                System.out.println("Получаемые значения: " + d + " " + i + " " + b);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
