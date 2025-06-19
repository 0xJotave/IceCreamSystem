package org.icecream.state;

public class OrderDelivered implements OrderState {
    public void next(OrderContext context) {
        System.out.println("Order already delivered");
    }

    public String getStatus() {
        return "Order delivered";
    }
}
