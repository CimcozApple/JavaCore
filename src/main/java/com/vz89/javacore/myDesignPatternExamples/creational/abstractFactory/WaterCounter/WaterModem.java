package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.WaterCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Modem;

public class WaterModem implements Modem {
    @Override
    public void dataTransfer() {
        System.out.println("Transfer Water data...");
    }
}
