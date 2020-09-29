package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

public class Operator {
    CounterBuilder counterBuilder;

    public void setCounterBuilder(CounterBuilder counterBuilder) {
        this.counterBuilder = counterBuilder;
    }
    Counter buildCounter() {
        counterBuilder.createCounter();
        counterBuilder.buildController();
        counterBuilder.buildSensor();
        return counterBuilder.getCounter();
    }
}
