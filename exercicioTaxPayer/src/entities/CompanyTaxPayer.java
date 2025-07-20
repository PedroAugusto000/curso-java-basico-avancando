package entities;

public class CompanyTaxPayer extends TaxPayer{

	private static final double taxCompany = 0.16;
	private static final double taxMoreEmployees = 0.14;
			
	private Integer numberEmployees;

	public CompanyTaxPayer(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public Double taxCalculator() {
		if(getNumberEmployees() > 10) {
			return super.getAnualIncome() * taxMoreEmployees;
		} else {
			return super.getAnualIncome() * taxCompany;
		}
	}
	
	@Override
	public String toString() {
		return " " + taxCalculator();
	}
}
