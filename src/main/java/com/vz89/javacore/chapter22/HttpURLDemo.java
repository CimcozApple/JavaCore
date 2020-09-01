package main.java.com.vz89.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запрос" + httpURLConnection.getRequestMethod());

        System.out.println("Код ответа" + httpURLConnection.getResponseCode());

        System.out.println("Ответное сообщение " + httpURLConnection.getResponseMessage());

        Map<String, List<String>> hdrMap = httpURLConnection.getHeaderFields();

        Set<String> hdrField = hdrMap.keySet();

        System.out.println("Далее следует заголовок");

        for(String k : hdrField) {
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
        }
    }
}
