package org.icecream.strategy;

public class RegularCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}
