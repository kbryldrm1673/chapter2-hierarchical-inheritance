package chapter2.hierarchical.inheritance.sample.tax;

public class Tax {

	protected double value;

	public Tax(double value) {
		this.value = value;
	}
	
	public double calculate() {
		
		return this.value * 0.10;
	}

}
