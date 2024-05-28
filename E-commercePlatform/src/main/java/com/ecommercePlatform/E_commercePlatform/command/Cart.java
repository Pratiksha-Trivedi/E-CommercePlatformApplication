package com.ecommercePlatform.E_commercePlatform.command;
import com.ecommercePlatform.E_commercePlatform.Decorator.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();
    private double discount = 0.0;

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public void updateQuantity(Product product, int quantity) {
        items.put(product, quantity);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

}
