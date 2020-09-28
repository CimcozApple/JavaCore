package main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.HeatCounter;

import main.java.com.vz89.javacore.myDesignPatternExamples.creational.abstractFactory.Controller;

public class HeatController implements Controller {
    @Override
    public void dataReceiver() {
        System.out.println("Receive heat data...");
    }
}
