package main.java.com.vz89.javacore.designPatterns.behavioral.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Hibernate","Maven","PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Vadim",skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
