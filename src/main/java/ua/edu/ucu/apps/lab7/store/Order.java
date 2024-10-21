package ua.edu.ucu.apps.lab7.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab7.store.Delivery.Delivery;
import ua.edu.ucu.apps.lab7.store.payment.Payment;

@Getter
@Setter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double sum = items.stream()
                .mapToDouble(item -> item.price())
                .sum();
        return payment.pay(sum);
    }
    
    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        payment.pay(totalPrice);
        delivery.deliver(items);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
}
