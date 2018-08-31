package Ex2;

public class BasePlusComissionEmploye {

	/*************
	 * ATRIBUTOS *
	 *************/
	private double baseSalary;
	private ComissionEmployee comissionEmployee;
	
	/**************
	 * CONSTRUTOR *
	 **************/
	public BasePlusComissionEmploye(double baseSalary, ComissionEmployee comissionEmployee) {
		this.baseSalary = baseSalary;
		this.comissionEmployee = comissionEmployee;
	}

	public String getFirstName() {
		return comissionEmployee.getFirstName();
	}
	
	public String getLastName() {
		return comissionEmployee.getLastName();
	}

	public String getSocialSecurityNumber() {
		return comissionEmployee.getSocialSecurityNumber();
	}

	public double getGrossSales() {
		return comissionEmployee.getGrossSales();
	}

	public double getComissionRate() {
		return comissionEmployee.getComissionRate();
	}

	/***********
	 * METODOS *
	 ***********/
	public double earnings() {
		return comissionEmployee.earnings() + baseSalary;
	}
	
	public String toString() {
		return "Nome: " + getFirstName() + " " + getLastName() + "\nNumero do seguro social: " + getSocialSecurityNumber() + "\nVendas Brutas: " + getGrossSales() + "\nTaxa de comissao: " + getComissionRate() + "\nLucros: " + earnings() + "\nSalario base: " + baseSalary;
	}
}
