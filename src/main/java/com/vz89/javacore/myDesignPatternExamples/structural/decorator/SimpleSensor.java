package main.java.com.vz89.javacore.myDesignPatternExamples.structural.decorator;

public class SimpleSensor implements Sensor {
    @Override
    public String measureValue() {
        return "Measuer value";
    }
}
