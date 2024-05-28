package com.ecommercePlatform.E_commercePlatform.Decorator;
public class GiftWrapDecorator extends ProductDecorator {
    private double giftWrapPrice = 5.0;

    public GiftWrapDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + giftWrapPrice;
    }
}
