package Ex2;

public class ComissionEmployee {
	
	/*************
	 * ATRIBUTOS *
	 *************/
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double comissionRate;
	
	/**************
	 * CONSTRUTOR *
	 **************/
	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}
	/*********************
	 * Getters e Setters *
	 *********************/
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getComissionRate() {
		return comissionRate;
	}

	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}

	/***********
	 * METODOS *
	 ***********/
	public double earnings() {
		return this.grossSales * this.comissionRate;
	}
	
	public String toString() {
		return "Nome: " + firstName + " " + lastName + "\nNumero do seguro social: " + socialSecurityNumber + "\nVendas Brutas: " + grossSales + "\nTaxa de comissao: " + comissionRate + "\nLucros: " + earnings();
	}
}
