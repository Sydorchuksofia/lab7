package ua.edu.ucu.apps.lab7.store.Delivery;

import java.util.List;

import ua.edu.ucu.apps.lab7.store.Item;

public interface Delivery {
    public double deliver(List<Item> items);
}