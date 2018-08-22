package Ex2;

public class Main {
	public static void main(String[] args) {
		ComissionEmployee pessoa = new ComissionEmployee("Filipe", "Ferreira Falco", "125651665", 2351, 0.5);
		BasePlusComissionEmploye pessoaMais= new BasePlusComissionEmploye(pessoa, pessoa, pessoa, pessoa, pessoa, 2000);

		System.out.printf("Pessoa:\n%s\nPessoa com mais informações:\n%s",pessoa.toString(), pessoaMais.toString());
	}
}