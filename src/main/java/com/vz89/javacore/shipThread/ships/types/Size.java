package main.java.com.vz89.javacore.shipThread.ships.types;

public enum Size {
    SMALL(10),MIDDLE(50), LARGE(100);
    private final int value;

    Size(int i) {
        this.value=i;
    }

    public int getValue() {
        return value;
    }
}
