package com.ecommercePlatform.E_commercePlatform.strategy;


public class InternationalShipping implements ShippingMethod {
    @Override
    public double calculate(double weight, double distance) {
        return weight * 1.0 + distance * 0.5;
    }
}
