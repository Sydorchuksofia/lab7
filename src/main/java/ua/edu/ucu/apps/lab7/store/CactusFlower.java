package ua.edu.ucu.apps.lab7.store;

public class CactusFlower extends Flower {
    public CactusFlower(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, 10.0, FlowerType.CACTUSFLOWER);
    }

    public CactusFlower() {

    }
    
    @Override
    public double price() {
        return 10.0;
    }
}