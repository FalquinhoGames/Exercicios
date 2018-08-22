package Ex2;

public class BasePlusComissionEmploye {
	ComissionEmployee c1 = new ComissionEmployee();

	/*************
	 * ATRIBUTOS *
	 *************/
	private ComissionEmployee firstName;
	private ComissionEmployee lastName;
	private ComissionEmployee socialSecurityNumber;
	private ComissionEmployee grossSales;
	private ComissionEmployee comissionRate;
	private double baseSalary;

	public BasePlusComissionEmploye(ComissionEmployee firstName, ComissionEmployee lastName, ComissionEmployee socialSecurityNumber, ComissionEmployee grossSales,
									ComissionEmployee comissionRate, double baseSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
		this.baseSalary = baseSalary;
	}

	/***********
	 * METODOS *
	 ***********/
	public double earnings() {
		return c1.earnings() + baseSalary;
	}
	
	public String toString() {
		return "Nome: " + firstName + " " + lastName + "\nNumero do seguro social: " + socialSecurityNumber + "\nVendas Brutas: " + grossSales + "\nTaxa de comissao: " + comissionRate + "\nLucros: " + earnings() + "\nSalario base: " + baseSalary;
	}
}
