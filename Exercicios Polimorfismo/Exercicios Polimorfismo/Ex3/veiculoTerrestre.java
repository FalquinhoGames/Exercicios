package Ex3;

public class veiculoTerrestre extends Veiculos{
	
	public veiculoTerrestre(String veiculo) {
		super(veiculo);
	}

	@SuppressWarnings("unused")
	public String andar() {
		String andar = null;
		if(andar == "andar") {
			return "Veiculo Andando";
		}
			return "Nada aconteceu!";
	}
}