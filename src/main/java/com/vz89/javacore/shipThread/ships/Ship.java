package main.java.com.vz89.javacore.shipThread.ships;

import main.java.com.vz89.javacore.shipThread.ships.types.Size;
import main.java.com.vz89.javacore.shipThread.ships.types.Type;

public class Ship {
    private int count;
    private Size size;
    private Type type;

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countCheck() {
        return count < size.getValue();
    }

    public int getCount() {
        return count;
    }

    public Size getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }
}
