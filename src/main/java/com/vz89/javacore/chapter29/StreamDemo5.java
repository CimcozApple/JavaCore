package main.java.com.vz89.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }

    @Override
    public String toString() {
        return "NamePhoneEmail{" +
                "name='" + name + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class NamePhone {
    String name;
    String phoneum;

    public NamePhone(String name, String phoneum) {
        this.name = name;
        this.phoneum = phoneum;
    }

    @Override
    public String toString() {
        return "NamePhone{" +
                "name='" + name + '\'' +
                ", phoneum='" + phoneum + '\'' +
                '}';
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> namePhoneEmails = new ArrayList<>();
        namePhoneEmails.add(new NamePhoneEmail("Bob","12345","bob@bob.ru"));
        namePhoneEmails.add(new NamePhoneEmail("James","34567","JAmes@JAmes.ru"));
        namePhoneEmails.add(new NamePhoneEmail("Kate","312521","Kate@JAmes.ru"));

        System.out.println("Исходные элементы из списка namePhoneEmails: ");
        namePhoneEmails.forEach(System.out::println);

        Stream<NamePhone> nameAndPhone = namePhoneEmails.stream().map(a -> new NamePhone(a.name,a.phonenum));
        System.out.println("Список имен и номера телефонов: ");
        nameAndPhone.forEach(System.out::println);

    }


}
