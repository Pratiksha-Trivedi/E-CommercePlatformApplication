package com.ecommercePlatform.E_commercePlatform.Decorator;
public class WarrantyDecorator extends ProductDecorator {
    private double warrantyPrice = 20.0;

    public WarrantyDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + warrantyPrice;
    }
}