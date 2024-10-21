package ua.edu.ucu.apps.lab7.store;
public class BasketDecorator extends ItemDecorator {
    Item item;
    
    public BasketDecorator(Item item) {
        this.item = item;
    }
    
    @Override
    public String getDescription() {
        return item.getDescription() + ", Placed in Basket";
    }
    
    @Override
    public double price() {
        return 4.0 + item.price();
    }
}