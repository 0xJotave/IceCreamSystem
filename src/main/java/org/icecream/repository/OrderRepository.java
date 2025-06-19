package org.icecream.repository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<String> orders = new ArrayList<>();

    public void saveOrder(String order) {
        orders.add(order);
    }

    public List<String> getOrders() {
        return orders;
    }
}
