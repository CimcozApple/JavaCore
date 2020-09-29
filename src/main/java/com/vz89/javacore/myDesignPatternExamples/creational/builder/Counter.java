package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.ControllerType;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.SensorType;

public class Counter {
    SensorType sensorType;
    ControllerType controllerType;

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public void setControllerType(ControllerType controllerType) {
        this.controllerType = controllerType;
    }
}
