package ua.edu.ucu.apps.lab7.store;

public class RibbonDecorator extends Item {
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price() + 10.0;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " Item with ribbon.";
    }
}