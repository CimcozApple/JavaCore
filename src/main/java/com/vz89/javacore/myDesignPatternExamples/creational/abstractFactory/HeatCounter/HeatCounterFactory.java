package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.HeatCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Controller;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.CounterFactory;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Modem;
import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Sensor;

public class HeatCounterFactory implements CounterFactory {
    @Override
    public Sensor getSensor() {
        return new HeatSensor();
    }

    @Override
    public Controller getController() {
        return new HeatController();
    }

    @Override
    public Modem getModem() {
        return new HeatModem();
    }

}
