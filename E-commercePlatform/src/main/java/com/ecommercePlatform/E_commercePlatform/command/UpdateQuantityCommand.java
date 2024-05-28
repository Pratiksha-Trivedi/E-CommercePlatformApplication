package com.ecommercePlatform.E_commercePlatform.command;

import com.ecommercePlatform.E_commercePlatform.Decorator.Product;

public class UpdateQuantityCommand implements CheckoutCommand {
    private Cart cart;
    private Product product;
    private int quantity;

    public UpdateQuantityCommand(Cart cart, Product product, int quantity) {
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        cart.updateQuantity(product, quantity);
    }
}
