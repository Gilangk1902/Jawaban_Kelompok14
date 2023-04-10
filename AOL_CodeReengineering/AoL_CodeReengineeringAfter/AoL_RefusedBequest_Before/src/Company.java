
public class Company{
	private double revenues;
	private double expenses;
	public PersonalTaxCalculator taxCalculator;
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	
	
}
