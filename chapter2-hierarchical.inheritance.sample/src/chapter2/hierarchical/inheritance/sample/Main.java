package chapter2.hierarchical.inheritance.sample;

import chapter2.hierarchical.inheritance.sample.product.Computer;
import chapter2.hierarchical.inheritance.sample.product.Product;
import chapter2.hierarchical.inheritance.sample.product.ProductPriceCalculator;
import chapter2.hierarchical.inheritance.sample.product.Telephone;
import chapter2.hierarchical.inheritance.sample.tax.KDVTax;
import chapter2.hierarchical.inheritance.sample.tax.OTVTax;
import chapter2.hierarchical.inheritance.sample.tax.SocialRequirementTax;
import chapter2.hierarchical.inheritance.sample.tax.Tax;

public class Main {

	public static void main(String[] args) {
		
		double computerPrice = 10000;
		
		Tax[] taxesForComputer = new Tax[2];
		taxesForComputer[0] = new KDVTax(computerPrice);
		taxesForComputer[1] = new OTVTax(computerPrice);
		
		Computer computer = new Computer(computerPrice, taxesForComputer);
		
		
		
		double telephonePrice = 2000;
		
		Tax[] taxesForTelephone = new Tax[3];
		taxesForTelephone[0] = new KDVTax(telephonePrice);
		taxesForTelephone[1] = new OTVTax(telephonePrice);
		taxesForTelephone[2] = new SocialRequirementTax(telephonePrice);
		
		Telephone telephone = new Telephone(telephonePrice, taxesForTelephone);
		
		
		// Bu diziyi bir alışveriş sitesinde seçtiğiniz ürünler sepeti gibi düşünebilirsiniz.
		Product[] myProductBasket = new Product[2];
		myProductBasket[0] = computer;
		myProductBasket[1] = telephone;
		
		// Sepetinize eklediğiniz ürünler vergiler dahil toplam fiyatı.
		double totalBasketInvoicePrice = ProductPriceCalculator.calculatePrices(myProductBasket);
		
		System.out.println("Your basket total price is " + totalBasketInvoicePrice);
	}

}
