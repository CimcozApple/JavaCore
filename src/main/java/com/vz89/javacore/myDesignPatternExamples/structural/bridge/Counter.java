package main.java.com.vz89.javacore.myDesignPatternExamples.structural.bridge;

public abstract class Counter {
    protected Controller controller;

    public Counter(Controller controller) {
        this.controller = controller;
    }

    public abstract void count();
}
