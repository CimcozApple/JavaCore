package main.java.com.vz89.javacore.myDesignPatternExamples.structural.bridge;

public class HeatCounter extends Counter {
    public HeatCounter(Controller controller) {
        super(controller);
    }

    @Override
    public void count() {
        System.out.println("Count heat");
        controller.dateReceiver();
    }
}
