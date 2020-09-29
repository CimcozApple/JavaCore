package main.java.com.vz89.javacore.myDesignPatternExamples.structural.composite;

public class WaterSensor implements Sensor {
    @Override
    public void getMeasure() {
        System.out.println("Water sensor");
    }
}
