package com.ecommercePlatform.E_commercePlatform.command;

import com.ecommercePlatform.E_commercePlatform.Decorator.Product;

public class RemoveItemCommand implements CheckoutCommand {
    private Cart cart;
    private Product product;

    public RemoveItemCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeItem(product);
    }
}