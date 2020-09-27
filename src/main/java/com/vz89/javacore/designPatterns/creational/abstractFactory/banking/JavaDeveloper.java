package main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.banking;

import main.java.com.vz89.javacore.designPatterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write java bank code");
    }
}
