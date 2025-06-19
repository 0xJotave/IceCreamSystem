package org.icecream.state;

public class OrderReceived implements OrderState {
    public void next(OrderContext context) {
        context.setState(new OrderPreparing());
    }

    public String getStatus() {
        return "Order received";
    }
}
