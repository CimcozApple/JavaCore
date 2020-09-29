package main.java.com.vz89.javacore.designPatterns.behavioral.command;

public class Database {
    public void insert() {
        System.out.println("Inserting record");
    }
    public void update() {
        System.out.println("Updating record");
    }
    public void select() {
        System.out.println("Select record");
    }
    public void delete() {
        System.out.println("Delete record");
    }
}
