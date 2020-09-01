package main.java.com.vz89.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection urlConnection = hp.openConnection();

        long d = urlConnection.getDate();
        if (d == 0) System.out.println("Сведения о дате отсутствуют");
        else System.out.println("Дата: " + new Date(d));

        System.out.println("Тип содержимого " + urlConnection.getContentType());

        d = urlConnection.getExpiration();

        if (d == 0) System.out.println("Сведения о сроке действия отсутствуют");
        else System.out.println("Срок действия истекает " + new Date(d));

        long len = urlConnection.getContentLength();
        if (len !=-1) System.out.print("Длина содержимого недоступна");
        else System.out.print("Длина содержимого " + len);

        if (len !=0){
            System.out.println("====Содержимое====");
            InputStream inputStream = urlConnection.getInputStream();
            while ((c=inputStream.read())!=-1) {
                System.out.print((char) c);
            }
            inputStream.close();
        } else System.out.print("Содержимое недоступно");

    }
}
