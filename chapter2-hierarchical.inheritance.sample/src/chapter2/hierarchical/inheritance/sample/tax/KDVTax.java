package chapter2.hierarchical.inheritance.sample.tax;

public class KDVTax extends Tax {

	public KDVTax(double value) {
		super(value);
	}
	
	@Override
	public double calculate() {
		
		return (super.value * 0.18) + 5;
	}
}
