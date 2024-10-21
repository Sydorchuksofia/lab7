package ua.edu.ucu.apps.lab7.store.Delivery;

import java.util.List;

import ua.edu.ucu.apps.lab7.store.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public double deliver(List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        if (sum > 1000) {
            return 10;
        } else {
            return 100;
        }
    }
}