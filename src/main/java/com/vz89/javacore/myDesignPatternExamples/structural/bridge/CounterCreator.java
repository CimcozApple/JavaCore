package main.java.com.vz89.javacore.myDesignPatternExamples.structural.bridge;

public class CounterCreator {
    public static void main(String[] args) {
        Counter counter = new HeatCounter(new TeplocomController());
        Counter counter1 = new WaterCounter(new VzletController());

        counter.count();
        counter1.count();
    }
}
