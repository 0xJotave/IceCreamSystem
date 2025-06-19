package org.icecream.state;

public class OrderPreparing implements OrderState {
    public void next(OrderContext context) {
        context.setState(new OrderDelivered());
    }

    public String getStatus() {
        return "Order preparing";
    }
}
