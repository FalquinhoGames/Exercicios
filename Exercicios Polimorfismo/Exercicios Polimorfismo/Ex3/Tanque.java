package Ex3;

public class Tanque extends veiculoTerrestre{
	public int quantidadeDeMunicao;

	public Tanque(String veiculo, int quantidadeDeMunicao) {
		super(veiculo);
		this.quantidadeDeMunicao = quantidadeDeMunicao;
	}

	public Tanque(String veiculo) {
		super(veiculo);
	}

}
