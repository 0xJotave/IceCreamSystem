package org.icecream.state;

public interface OrderState {
    void next(OrderContext context);
    String getStatus();
}
