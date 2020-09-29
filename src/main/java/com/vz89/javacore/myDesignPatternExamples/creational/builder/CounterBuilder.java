package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

public abstract class CounterBuilder {
    Counter counter;

    void createCounter() {
        counter = new Counter();
    }

    public Counter getCounter() {
        return counter;
    }

    abstract void buildSensor();

    abstract void buildController();
}
