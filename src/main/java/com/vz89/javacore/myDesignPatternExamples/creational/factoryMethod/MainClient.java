package main.java.com.vz89.javacore.myDesignPatternExamples.creational.factoryMethod;

public class MainClient {
    public static void main(String[] args) {
        SensorFactory sensorFactory = getSensorBySensorType("pressure");
        Sensor sensor = sensorFactory.createSensor();
        sensor.measureValue();
    }


    public static SensorFactory getSensorBySensorType(String type) {
        if (type.equals("temp")) return new TemperatureSensorFactory();
        else if (type.equals("pressure")) return new PreassureSensorFactory();
        else throw new RuntimeException(type + " type is not supported");
    }
}
