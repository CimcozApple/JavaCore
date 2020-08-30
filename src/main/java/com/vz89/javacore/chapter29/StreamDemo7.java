package main.java.com.vz89.javacore.chapter29;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> namePhoneEmails = new ArrayList<>();
        namePhoneEmails.add(new NamePhoneEmail("Bob", "12345", "bob@bob.ru"));
        namePhoneEmails.add(new NamePhoneEmail("James", "34567", "JAmes@JAmes.ru"));
        namePhoneEmails.add(new NamePhoneEmail("Kate", "312521", "Kate@JAmes.ru"));

        System.out.println("Исходные элементы из списка namePhoneEmails: ");
        namePhoneEmails.forEach(System.out::println);

        Stream<NamePhone> nameAndPhone = namePhoneEmails.stream().map(a -> new NamePhone(a.name, a.phonenum));
        List<NamePhone> namePhoneList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Отображение List");
        for (NamePhone namePhone : namePhoneList) System.out.println(namePhone);

        nameAndPhone = namePhoneEmails.stream().map(a -> new NamePhone(a.name, a.phonenum));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Отображение Set");
        for (NamePhone namePhone : npSet) System.out.println(namePhone);

        LinkedList<NamePhone> npLinkedList = nameAndPhone.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

        HashSet<NamePhone> npHashSet = nameAndPhone.collect(HashSet::new,HashSet::add,HashSet::addAll);


    }
}
