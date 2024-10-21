package ua.edu.ucu.apps.lab7.store;

public class PaperDecorator extends ItemDecorator {
    
    Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", Wrapped in Paper";
    }

    @Override
    public double price() {
        return 13.0 + item.price();
    }

}