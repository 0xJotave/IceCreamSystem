package org.icecream.factory;

import org.icecream.model.BasicIceCream;
import org.icecream.model.IceCream;

public class IceCreamFactory {
    public static IceCream createIceCream(String type) {
        return switch (type) {
            case "stick" -> new BasicIceCream(3.0, "Ice Cream Stick");
            case "cup" -> new BasicIceCream(4.5, "Cup Ice Cream");
            case "milkshake" -> new BasicIceCream(6.0, "Milkshake");
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
