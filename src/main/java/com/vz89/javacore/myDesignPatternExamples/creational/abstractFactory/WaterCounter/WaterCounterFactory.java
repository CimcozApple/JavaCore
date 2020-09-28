package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.WaterCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Controller;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.CounterFactory;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Modem;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Sensor;

public class WaterCounterFactory implements CounterFactory {
    @Override
    public Sensor getSensor() {
        return new WaterSensor();
    }

    @Override
    public Controller getController() {
        return new WaterController();
    }

    @Override
    public Modem getModem() {
        return new WaterModem();
    }
}
