package main.java.com.vz89.javacore.myDesignPatternExamples.structural.proxy;

public class HardData implements Data {
    public HardData() {
    }

    @Override
    public void getData() {
        System.out.println("Get data from old structure");
    }
}
