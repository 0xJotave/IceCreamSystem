package org.icecream.observer;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String status) {
        System.out.println("Order status updated for " + name + ": " + status);
    }
}
