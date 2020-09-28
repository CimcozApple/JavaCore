package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory;

public interface CounterFactory {
    Sensor getSensor();
    Controller getController();
    Modem getModem();
}
