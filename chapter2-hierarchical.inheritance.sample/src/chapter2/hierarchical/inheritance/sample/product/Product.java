package chapter2.hierarchical.inheritance.sample.product;

import chapter2.hierarchical.inheritance.sample.tax.Tax;
import chapter2.hierarchical.inheritance.sample.tax.TaxCalculator;

public class Product {

	protected double price;
	
	protected Tax[] taxes;
	
	// parametreli kurucu metot
	public Product(double price, Tax[] taxes) {
		
		this.price = price;
		this.taxes = taxes;
	}
	
	// vergiler dahil toplam fiyat değeri hesaplayan fonksiyon
	public double priceCalculate() {
		
		double totalTaxValue = TaxCalculator.totalTaxValue(taxes);
		return this.price + totalTaxValue;
	}
	
}
