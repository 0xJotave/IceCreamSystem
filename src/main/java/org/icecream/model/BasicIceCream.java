package org.icecream.model;

public class BasicIceCream implements IceCream {
    private double price;
    private String description;

    public BasicIceCream(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
