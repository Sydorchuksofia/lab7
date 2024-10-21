package ua.edu.ucu.apps.lab7;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab7.store.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.store.Delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.store.Item;

import java.util.Arrays;
import java.util.List;
class DeliveryStrategyTest {
    private DHLDeliveryStrategy dhlDelivery;
    private PostDeliveryStrategy postDelivery;
    private List<Item> itemsUnder1000;
    private List<Item> itemsOver1000;

    @BeforeEach
    void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();

        itemsUnder1000 = Arrays.asList(
            new Item() {
                @Override
                public double price() {
                    return 500;
                }
            },
            new Item() {
                @Override
                public double price() {
                    return 400;
                }
            }
        );

        itemsOver1000 = Arrays.asList(
            new Item() {
                @Override
                public double price() {
                    return 1001;
                }
            }
        );
    }

    @Test
    void testDHLDeliveryUnder1000() {
        double cost = dhlDelivery.deliver(itemsUnder1000);
        assertEquals(200, cost);
    }

    @Test
    void testDHLDeliveryOver1000() {
        double cost = dhlDelivery.deliver(itemsOver1000);
        assertEquals(20, cost);
    }

    @Test
    void testPostDeliveryUnder1000() {
        double cost = postDelivery.deliver(itemsUnder1000);
        assertEquals(100, cost);
    }

    @Test
    void testPostDeliveryOver1000() {
        double cost = postDelivery.deliver(itemsOver1000);
        assertEquals(10, cost);
    }
}