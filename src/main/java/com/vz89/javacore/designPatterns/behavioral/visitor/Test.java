package main.java.com.vz89.javacore.designPatterns.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
