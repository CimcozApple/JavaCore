package main.java.com.vz89.javacore.myDesignPatternExamples.structural.decorator;

public class SensorDecorator implements Sensor {
    Sensor sensor;

    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String measureValue() {
        return sensor.measureValue();
    }

}
