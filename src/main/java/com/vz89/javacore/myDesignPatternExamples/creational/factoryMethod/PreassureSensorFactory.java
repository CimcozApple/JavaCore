package main.java.com.vz89.javacore.myDesignPatternExamples.creational.factoryMethod;

public class PreassureSensorFactory implements SensorFactory {
    @Override
    public Sensor createSensor() {
        return new PressureSensor();
    }
}
