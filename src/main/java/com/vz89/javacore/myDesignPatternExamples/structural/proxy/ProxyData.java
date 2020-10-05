package main.java.com.vz89.javacore.myDesignPatternExamples.structural.proxy;

public class ProxyData extends HardData {

    @Override
    public void getData() {
        getCloudData();
    }

    public void getCloudData(){
        System.out.println("get cloud data");
    }
}
