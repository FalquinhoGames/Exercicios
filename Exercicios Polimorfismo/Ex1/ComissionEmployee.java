package Ex1;

public class ComissionEmployee {
	
	/*************
	 * ATRIBUTOS *
	 *************/
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double comissionRate;
	
	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}
	
	/***********
	 * METODOS *
	 ***********/
	public double earnings() {
		return this.grossSales * this.comissionRate;
	}
	
	public String toString() {
		return "Nome: " + firstName + " " + lastName + "\nN�mero do seguro social: " + socialSecurityNumber + "\nVendas Brutas: " + grossSales + "\nTaxa de comiss�o: " + comissionRate + "\nLucros: " + earnings();
	}
}
