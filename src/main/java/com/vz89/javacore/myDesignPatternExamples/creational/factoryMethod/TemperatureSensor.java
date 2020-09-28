package main.java.com.vz89.javacore.myDesignPatternExamples.creational.factoryMethod;

public class TemperatureSensor implements Sensor {

    @Override
    public void measureValue() {
        System.out.println("Measuring temperature value...");
    }
}
