package Ex3;

public class Moto extends veiculoTerrestre{
	public int anoDeFabricacao;

	public Moto(String veiculo, int anoDeFabricacao) {
		super(veiculo);
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public Moto(String veiculo) {
		super(veiculo);
	}

}
