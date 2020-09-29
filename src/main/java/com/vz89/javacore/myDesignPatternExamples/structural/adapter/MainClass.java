package main.java.com.vz89.javacore.myDesignPatternExamples.structural.adapter;

public class MainClass {
    public static void main(String[] args) {
        Database database = new AdapterScadaToDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
