package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

public class MainClient {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.setCounterBuilder(new PressureCounterBuilder());

        Counter counter = operator.buildCounter();
        System.out.println(counter);
    }
}
