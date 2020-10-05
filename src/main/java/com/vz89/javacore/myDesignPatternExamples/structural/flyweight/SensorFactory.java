package main.java.com.vz89.javacore.myDesignPatternExamples.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SensorFactory {
    private static final Map<String, Sensor> sensors = new HashMap<>();

    public Sensor getSensorByType(String type) {
        Sensor sensor = sensors.get(type);

        if (sensor == null) {
            switch (type) {
                case "temp":
                    System.out.println("get temperature sensor");
                    sensor = new TemperatureSensor();
                    break;
                case "pressure":
                    System.out.println("get pressure sensor");
                    sensor = new PressureSensor();
                    break;
            }
            sensors.put(type, sensor);
        }
        return sensor;
    }

}
