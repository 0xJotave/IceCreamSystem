package org.icecream.singleton;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private static OrderQueue instance;
    private Queue<String> queue = new LinkedList<>();

    private OrderQueue() {}

    public static synchronized OrderQueue getInstance() {
        if (instance == null) {
            instance = new OrderQueue();
        }
        return instance;
    }

    public void addOrder(String order) {
        queue.add(order);
    }

    public String getNextOrder() {
        return queue.poll();
    }
}
