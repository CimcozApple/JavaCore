package main.java.com.vz89.javacore.designPatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setBuilder(new SuperSiteBuilder());

        Website website = creator.buildWebsite();

        System.out.println(website);
    }
}
