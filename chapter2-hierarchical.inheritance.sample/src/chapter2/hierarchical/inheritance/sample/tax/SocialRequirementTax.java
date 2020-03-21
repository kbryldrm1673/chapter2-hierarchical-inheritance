package chapter2.hierarchical.inheritance.sample.tax;

public class SocialRequirementTax extends Tax{
	
	public SocialRequirementTax(double value) {
		
		super(value);
	}
	
	@Override
	public double calculate() {
		
		return 10;
	}
}
