package org.icecream.command;

public class PlaceOrderCommand implements OrderCommand {
    private String order;

    public PlaceOrderCommand(String order) {
        this.order = order;
    }

    public void execute() {
        System.out.println("Order placed: " + order);
    }

    public void undo() {
        System.out.println("Order cancelled: " + order);
    }
}
