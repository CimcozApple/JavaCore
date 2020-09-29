package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.ControllerType;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.SensorType;

public class TemperatureCounterBuilder extends CounterBuilder {
    @Override
    void buildSensor() {
        counter.setControllerType(ControllerType.ABB);
    }

    @Override
    void buildController() {
        counter.setSensorType(SensorType.TEMPERATURE);
    }
}
