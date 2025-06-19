package org.icecream.strategy;

public class SeasonalDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.85;
    }
}
