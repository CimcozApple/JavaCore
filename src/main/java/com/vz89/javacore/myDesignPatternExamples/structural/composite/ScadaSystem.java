package main.java.com.vz89.javacore.myDesignPatternExamples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ScadaSystem {
    List<Sensor> sensorList = new ArrayList<>();

    public void addSensor(Sensor sensor){
        sensorList.add(sensor);
    }

    public void createSubsystem() {
        for (Sensor sensor: sensorList) {
            sensor.getMeasure();
        }
    }
}
