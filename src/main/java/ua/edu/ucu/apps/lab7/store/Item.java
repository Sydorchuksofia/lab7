package ua.edu.ucu.apps.lab7.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private FlowerBucket flowerBucket;

    public abstract double price();

    public String getDescription() {
        return "Simple Item";
    }
}
