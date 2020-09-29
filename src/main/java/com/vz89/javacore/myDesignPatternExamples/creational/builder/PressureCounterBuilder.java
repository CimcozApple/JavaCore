package main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.ControllerType;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.builder.enums.SensorType;

public class PressureCounterBuilder extends CounterBuilder {
    @Override
    void buildSensor() {
        counter.setSensorType(SensorType.PRESSURE);
    }

    @Override
    void buildController() {
        counter.setControllerType(ControllerType.SIEMENS);
    }
}
