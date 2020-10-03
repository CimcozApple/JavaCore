package main.java.com.vz89.javacore.myDesignPatternExamples.structural.bridge;

public class WaterCounter extends Counter {
    public WaterCounter(Controller controller) {
        super(controller);
    }

    @Override
    public void count() {
        System.out.println("Count water");
        controller.dateReceiver();
    }
}
