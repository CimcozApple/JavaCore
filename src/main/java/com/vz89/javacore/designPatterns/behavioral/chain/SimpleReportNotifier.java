package main.java.com.vz89.javacore.designPatterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report" + message);
    }
}
