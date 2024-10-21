package ua.edu.ucu.apps.lab7.store.Delivery;

import java.util.List;

import ua.edu.ucu.apps.lab7.store.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public double deliver(List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        if (sum > 1000) {
            return 20;
        } else {
            return 200;
        }
    }
}