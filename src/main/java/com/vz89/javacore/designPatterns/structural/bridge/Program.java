package main.java.com.vz89.javacore.designPatterns.structural.bridge;

public abstract class  Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();


}
