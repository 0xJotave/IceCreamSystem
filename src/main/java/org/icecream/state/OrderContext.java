package org.icecream.state;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new OrderReceived();
    }

    public void nextState() {
        state.next(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStatus() {
        return state.getStatus();
    }
}
