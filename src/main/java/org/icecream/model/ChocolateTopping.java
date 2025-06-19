package org.icecream.model;

public class ChocolateTopping extends ToppingDecorator {
    public ChocolateTopping(IceCream iceCream) {
        super(iceCream);
    }

    public double getPrice() {
        return decoratedIceCream.getPrice() + 1.0;
    }

    public String getDescription() {
        return decoratedIceCream.getDescription() + ", chocolate";
    }
}
