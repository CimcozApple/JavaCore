package main.java.com.vz89.javacore.myDesignPatternExamples.creational.singleton;

public class SCADAService {
    private static SCADAService scadaService;

    private SCADAService() {
    }

    public synchronized SCADAService getSCADAService() {
        if (scadaService == null) scadaService = new SCADAService();
        return scadaService;
    }

}
