package ua.edu.ucu.apps.lab7.store;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int count;
    
    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.count = amount;
    }

    public double price() {
        return flower.price() * count;
    }
}
