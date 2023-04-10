
public class PersonalTaxCalculator {
	
	public double calculateTax(double income, double textRate) {
        double personalTax = income * textRate;
        return personalTax;
    }
}
