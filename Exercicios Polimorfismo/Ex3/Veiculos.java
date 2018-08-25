package Ex3;

public class Veiculos {
	private String veiculo;
	
	public Veiculos(String veiculo) {
		this.veiculo = veiculo;
	}
	
	public void locomover() {
		
	}
	
	public String bater(String veiculo) {
		return "O veiculo " + this.veiculo + " bateu no veiculo " + veiculo;
	}

	public String toString(){

	}
}
