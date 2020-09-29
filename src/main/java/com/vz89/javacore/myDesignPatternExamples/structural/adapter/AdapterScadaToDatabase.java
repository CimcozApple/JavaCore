package main.java.com.vz89.javacore.myDesignPatternExamples.structural.adapter;

public class AdapterScadaToDatabase extends ScadaApplication implements Database {
    @Override
    public void select() {
        getMeasure();
    }

    @Override
    public void update() {
        updateMeasure();
    }

    @Override
    public void remove() {
        deleteMeasure();
    }

    @Override
    public void insert() {
        setMeasure();
    }
}
