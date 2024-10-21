package ua.edu.ucu.apps.lab7.store;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class FlowerBucket extends Item{
    
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowers(FlowerPack flp) {
        flowerPacks.add(flp);
    }
    @Override
    public double price() {
        double price = 0;
        for (FlowerPack f : flowerPacks) {
            price += f.price();
        }
        return price;
    }
    
    public Flower searchFlower(FlowerType type) {
        for (FlowerPack flower : flowerPacks) {
            if (flower.getFlower().getFlowerType().equals(type)) {
                return flower.getFlower();
            }
        }
        return null;
    }
        
}