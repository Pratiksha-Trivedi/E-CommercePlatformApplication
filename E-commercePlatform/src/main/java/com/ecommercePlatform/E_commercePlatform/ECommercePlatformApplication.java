package com.ecommercePlatform.E_commercePlatform;

import com.ecommercePlatform.E_commercePlatform.Decorator.GiftWrapDecorator;
import com.ecommercePlatform.E_commercePlatform.Decorator.Product;
import com.ecommercePlatform.E_commercePlatform.Decorator.WarrantyDecorator;
import com.ecommercePlatform.E_commercePlatform.adapter.*;
import com.ecommercePlatform.E_commercePlatform.command.ApplyDiscountCommand;
import com.ecommercePlatform.E_commercePlatform.command.Cart;
import com.ecommercePlatform.E_commercePlatform.command.CheckoutCommand;
import com.ecommercePlatform.E_commercePlatform.strategy.ShippingMethod;
import com.ecommercePlatform.E_commercePlatform.strategy.StandardShipping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommercePlatformApplication {
	public static void main(String[] args) {

		Product product1 = new Product("Laptop", 1200.00);
		Product product2 = new Product("Smartphone", 800.00);

		Cart cart = new Cart();

		CheckoutCommand applyDiscountCommand = new ApplyDiscountCommand(cart, 100.00);
		applyDiscountCommand.execute();

		Product giftWrapLaptop = new GiftWrapDecorator(product1);
		Product warrantySmartphone = new WarrantyDecorator(product2);

		ShippingMethod standardShipping = new StandardShipping();
		double shippingCost = standardShipping.calculate(5.0, 100.0);
		System.out.println("Standard Shipping Cost: " + shippingCost);

		PaymentAdapter paypalAdapter = new PayPalAdapter(new PayPal());
		paypalAdapter.pay(2500.00);

		PaymentAdapter stripeAdapter = new StripeAdapter(new Stripe());
		stripeAdapter.pay(1500.00);
	}
}