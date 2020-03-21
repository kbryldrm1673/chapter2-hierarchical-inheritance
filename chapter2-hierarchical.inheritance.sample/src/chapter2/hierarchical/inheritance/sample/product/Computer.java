package chapter2.hierarchical.inheritance.sample.product;

import chapter2.hierarchical.inheritance.sample.tax.Tax;

public class Computer extends Product{

	public Computer(double price, Tax[] taxes) {
		super(price, taxes);
	}
	
	@Override
	public double priceCalculate() {
		
		// Product ismindeki ATA sınıftaki metot çağırılır.
		// ATA sınıftaki metot vergiler dahil hesaplanmış ücreti döndürür.
		double basePrice = super.priceCalculate();
		
		// vergili fiyat üzerinden kar marjı hesaplanıyor.
		// kar marjı her ürün farklıdır. Bu nedenle hesaplanması farklıdır.
		// Farklı olduğu için de "priceCalculate" metodu tüm alt sınıflarda "override" edilir. (Metot ezilir)
		basePrice += basePrice * 0.10;
		return basePrice;
	}
}
