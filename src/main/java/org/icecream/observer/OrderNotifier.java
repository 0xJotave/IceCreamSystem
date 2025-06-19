package org.icecream.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String status) {
        for (OrderObserver o : observers) {
            o.update(status);
        }
    }
}
