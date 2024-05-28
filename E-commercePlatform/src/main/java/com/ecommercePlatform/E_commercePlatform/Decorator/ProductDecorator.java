package com.ecommercePlatform.E_commercePlatform.Decorator;
public abstract class ProductDecorator extends Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        super(decoratedProduct.getName(), decoratedProduct.getPrice());
        this.decoratedProduct = decoratedProduct;
    }

    public abstract double getPrice();
}
