package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for(Order o : orders) {
            o.execute();
        }
        orders.clear();
    }
}
