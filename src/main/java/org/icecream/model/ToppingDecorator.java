package org.icecream.model;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream decoratedIceCream;

    public ToppingDecorator(IceCream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }
}
