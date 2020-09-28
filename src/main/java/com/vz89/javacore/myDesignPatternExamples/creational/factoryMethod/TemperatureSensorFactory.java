package main.java.com.vz89.javacore.myDesignPatternExamples.creational.factoryMethod;

public class TemperatureSensorFactory implements SensorFactory {
    @Override
    public Sensor createSensor() {
        return new TemperatureSensor();
    }
}
