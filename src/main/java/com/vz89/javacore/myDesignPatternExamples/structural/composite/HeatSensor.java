package main.java.com.vz89.javacore.myDesignPatternExamples.structural.composite;

public class HeatSensor implements Sensor {

    @Override
    public void getMeasure() {
        System.out.println("Heat measure");
    }
}
