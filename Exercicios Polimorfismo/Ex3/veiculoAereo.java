package Ex3;

public class veiculoAereo extends Veiculos{
	
	public veiculoAereo(String veiculo) {
		super(veiculo);
	}

	@SuppressWarnings("unused")
	public String voar() {
		String voar = null;
		if(voar == "voar") {
			return "Veiculo Voando";
		}
			return "Nada aconteceu!";
	}
}
