package Ex2;

public class Main {
	public static void main(String[] args) {
		ComissionEmployee pessoa = new ComissionEmployee("Filipe", "Ferreira Falco", "1110800", 0.10, 1000);
		BasePlusComissionEmploye pessoaMais= new BasePlusComissionEmploye(2000, pessoa);
		
		System.out.printf("Pessoa:\n%s\n\nPessoa com mais informações:\n%s",pessoa.toString(), pessoaMais.toString());
	}
}
