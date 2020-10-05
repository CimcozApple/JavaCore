package main.java.com.vz89.javacore.myDesignPatternExamples.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Sensor sensor = new SuperSensor(new SimpleSensor());
        System.out.println(sensor.measureValue());
    }
}
