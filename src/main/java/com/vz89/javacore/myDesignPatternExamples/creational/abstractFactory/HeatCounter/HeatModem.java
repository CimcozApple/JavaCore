package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.HeatCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Modem;

public class HeatModem implements Modem {
    @Override
    public void dataTransfer() {
        System.out.println("Transfer heat data...");
    }
}
