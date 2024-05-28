package com.ecommercePlatform.E_commercePlatform.adapter;

public class StripeAdapter implements PaymentAdapter {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        stripe.charge(amount);
    }
}