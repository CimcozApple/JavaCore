package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.HeatCounter;


import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Sensor;

public class HeatSensor implements Sensor {
    @Override
    public void measureValue() {
        System.out.println("Measure heat value");
    }
}
