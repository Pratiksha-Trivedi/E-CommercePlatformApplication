package com.ecommercePlatform.E_commercePlatform.strategy;

public class ExpeditedShipping implements ShippingMethod {
    @Override
    public double calculate(double weight, double distance) {
        return weight * 0.75 + distance * 0.2;
    }
}


