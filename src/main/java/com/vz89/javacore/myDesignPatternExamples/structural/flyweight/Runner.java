package main.java.com.vz89.javacore.myDesignPatternExamples.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SensorFactory sensorFactory = new SensorFactory();
        List<Sensor> sensors = new ArrayList<>();

        sensors.add(sensorFactory.getSensorByType("temp"));
        sensors.add(sensorFactory.getSensorByType("temp"));
        sensors.add(sensorFactory.getSensorByType("temp"));
        sensors.add(sensorFactory.getSensorByType("pressure"));
        sensors.add(sensorFactory.getSensorByType("pressure"));
        sensors.add(sensorFactory.getSensorByType("pressure"));
        sensors.add(sensorFactory.getSensorByType("pressure"));

        for (Sensor sensor:sensors) sensor.measureValue();

    }
}
