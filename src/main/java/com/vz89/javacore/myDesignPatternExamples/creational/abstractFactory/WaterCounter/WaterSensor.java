package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.WaterCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Sensor;

public class WaterSensor implements Sensor {
    @Override
    public void measureValue() {
        System.out.println("Measure water value...");
    }
}
