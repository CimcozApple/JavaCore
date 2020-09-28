package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.WaterCounter.WaterCounterFactory;

public class MainClient {
    public static void main(String[] args) {
        CounterFactory counterFactory = new WaterCounterFactory();
        Controller controller = counterFactory.getController();
        Modem modem = counterFactory.getModem();
        Sensor sensor = counterFactory.getSensor();

        sensor.measureValue();
        controller.dataReceiver();
        modem.dataTransfer();
    }
}
