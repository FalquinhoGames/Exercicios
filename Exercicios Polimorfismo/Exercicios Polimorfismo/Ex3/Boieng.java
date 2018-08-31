package Ex3;

public class Boieng extends veiculoAereo{
	private int acomodacoes;

	public Boieng(String veiculo, int acomodacoes) {
		super(veiculo);
		this.acomodacoes = acomodacoes;
	}

	public Boieng(String veiculo) {
		super(veiculo);
	}
}
