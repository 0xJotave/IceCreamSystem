package org.icecream.facade;

import org.icecream.model.IceCream;
import org.icecream.observer.OrderNotifier;
import org.icecream.strategy.DiscountStrategy;

public class OrderFacade {
    private DiscountStrategy discountStrategy;
    private OrderNotifier notifier;

    public OrderFacade(DiscountStrategy discountStrategy, OrderNotifier notifier) {
        this.discountStrategy = discountStrategy;
        this.notifier = notifier;
    }

    public void processOrder(IceCream iceCream) {
        double price = discountStrategy.applyDiscount(iceCream.getPrice());
        System.out.println("Processing order: " + iceCream.getDescription() + " - Price: " + price);
        notifier.notifyObservers("Order placed");
    }
}
