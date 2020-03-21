package chapter2.hierarchical.inheritance.sample.product;

public class ProductPriceCalculator {

	public static double calculatePrices(Product[] products) {
		
		double totalProductPrice = 0;

		if(products == null) {
			// fonksiyona input olarak gelen "products" isimli null değere sahipse fiyatı sıfır döndürüyoruz.
			return totalProductPrice;
		}
		
		for(Product product : products) {
			
			totalProductPrice += product.priceCalculate();
		}
		
		return totalProductPrice;
	}
}
