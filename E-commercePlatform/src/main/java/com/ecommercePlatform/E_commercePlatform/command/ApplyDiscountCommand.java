package com.ecommercePlatform.E_commercePlatform.command;
public class ApplyDiscountCommand implements CheckoutCommand {
    private Cart cart;
    private double discount;

    public ApplyDiscountCommand(Cart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public void execute() {
        cart.applyDiscount(discount);
    }
}