package main.java.com.vz89.javacore.myDesignPatternExamples.structural.composite;

public class MainClient {
    public static void main(String[] args) {
        ScadaSystem scadaSystem = new ScadaSystem();

        Sensor h1 = new HeatSensor();
        Sensor h2 = new HeatSensor();
        Sensor h3 = new HeatSensor();
        Sensor h4 = new HeatSensor();
        Sensor w1 = new WaterSensor();
        Sensor w2 = new WaterSensor();
        Sensor w3 = new WaterSensor();

        scadaSystem.addSensor(h1);
        scadaSystem.addSensor(h2);
        scadaSystem.addSensor(h3);
        scadaSystem.addSensor(h4);
        scadaSystem.addSensor(w1);
        scadaSystem.addSensor(w2);
        scadaSystem.addSensor(w3);

        scadaSystem.createSubsystem();
    }
}
