package com.ecommercePlatform.E_commercePlatform.adapter;

public class Stripe {
    public void charge(double amount) {
        System.out.println("Payment of " + amount + " made through Stripe.");
    }
}