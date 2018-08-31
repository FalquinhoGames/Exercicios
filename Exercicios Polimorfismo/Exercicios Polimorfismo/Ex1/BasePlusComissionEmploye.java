package Ex1;

public class BasePlusComissionEmploye extends ComissionEmployee{

    private double baseSalary;

	public BasePlusComissionEmploye(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                    double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		this.baseSalary = baseSalary;
	}
	
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	
	public String toString() {
		return super.toString() + "\nSal�rio base: " + baseSalary;
	}
}
