package org.icecream.app;

import org.icecream.command.PlaceOrderCommand;
import org.icecream.facade.OrderFacade;
import org.icecream.factory.IceCreamFactory;
import org.icecream.model.ChocolateTopping;
import org.icecream.model.IceCream;
import org.icecream.observer.Customer;
import org.icecream.observer.OrderNotifier;
import org.icecream.repository.OrderRepository;
import org.icecream.singleton.OrderQueue;
import org.icecream.state.OrderContext;
import org.icecream.strategy.RegularCustomerDiscount;

public class Main {
    public static void main(String[] args) {
        IceCream base = IceCreamFactory.createIceCream("cup");
        IceCream custom = new ChocolateTopping(base);

        OrderNotifier notifier = new OrderNotifier();
        notifier.addObserver(new Customer("Alice"));

        OrderFacade facade = new OrderFacade(new RegularCustomerDiscount(), notifier);
        facade.processOrder(custom);

        OrderQueue.getInstance().addOrder("Order1");

        PlaceOrderCommand cmd = new PlaceOrderCommand("Order1");
        cmd.execute();
        cmd.undo();

        OrderContext ctx = new OrderContext();
        System.out.println(ctx.getStatus());
        ctx.nextState();
        System.out.println(ctx.getStatus());
        ctx.nextState();
        System.out.println(ctx.getStatus());

        OrderRepository repo = new OrderRepository();
        repo.saveOrder("Order1");
        System.out.println(repo.getOrders());
    }
}