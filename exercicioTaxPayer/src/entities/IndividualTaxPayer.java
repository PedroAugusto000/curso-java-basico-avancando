package entities;

public class IndividualTaxPayer extends TaxPayer{

	private static final double taxMinus20k = 0.15;
	private static final double taxMore20k = 0.25;
	
	private Double healthExpenditure;

	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}
	
	@Override
	public Double taxCalculator() {
		if(super.getAnualIncome() <= 20000) {
			return super.getAnualIncome() * taxMinus20k - getHealthExpenditure() * 0.5;
		} else {
			return super.getAnualIncome() * taxMore20k - getHealthExpenditure() * 0.5;
		} 
	}
	
	@Override
	public String toString() {
		return " " + taxCalculator();
	}
}
