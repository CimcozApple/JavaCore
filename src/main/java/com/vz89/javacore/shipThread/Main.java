package main.java.com.vz89.javacore.shipThread;

import main.java.com.vz89.javacore.shipThread.ships.types.Type;
import main.java.com.vz89.javacore.shipThread.tasks.PierLoader;
import main.java.com.vz89.javacore.shipThread.tasks.ShipGenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());
        Tunnel tunnel = new Tunnel();
        ShipGenerator shipGenerator = new ShipGenerator(tunnel,10);

        PierLoader pierLoader1 = new PierLoader(tunnel, Type.BANANA);
        PierLoader pierLoader2 = new PierLoader(tunnel, Type.BREAD);
        PierLoader pierLoader3 = new PierLoader(tunnel, Type.CLOTHES);

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.execute(shipGenerator);
        executorService.execute(pierLoader1);
        executorService.execute(pierLoader2);
        executorService.execute(pierLoader3);

        executorService.shutdown();
    }
}
