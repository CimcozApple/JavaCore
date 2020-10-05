package main.java.com.vz89.javacore.myDesignPatternExamples.structural.decorator;

public class SuperSensor extends SensorDecorator {
    public SuperSensor(Sensor sensor) {
        super(sensor);
    }
    public String makeMeasureArchive() {
        return " make archive";
    }

    @Override
    public String measureValue() {
        return super.measureValue() + makeMeasureArchive();
    }
}
