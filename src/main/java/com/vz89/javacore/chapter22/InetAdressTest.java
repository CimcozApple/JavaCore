package main.java.com.vz89.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.sports.ru");
        System.out.println(Address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }
    }
}
