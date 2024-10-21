package ua.edu.ucu.apps.lab7.store;

public class RomashkaFlower extends Flower {
    
    public RomashkaFlower(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, 20.0, FlowerType.ROMASHKAFLOWER);
    }

    public RomashkaFlower() {
    }

    @Override
    public double price() {
        return 20.0;
    }
}