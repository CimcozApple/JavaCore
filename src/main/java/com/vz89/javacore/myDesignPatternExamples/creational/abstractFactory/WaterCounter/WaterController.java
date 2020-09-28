package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.WaterCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Controller;

public class WaterController implements Controller {
    @Override
    public void dataReceiver() {
        System.out.println("Receive water data...");
    }
}
