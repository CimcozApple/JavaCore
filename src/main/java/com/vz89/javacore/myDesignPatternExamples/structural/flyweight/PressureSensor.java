package main.java.com.vz89.javacore.myDesignPatternExamples.structural.flyweight;

public class PressureSensor implements Sensor {
    @Override
    public void measureValue() {
        System.out.println("Measure pressure...");
    }
}
