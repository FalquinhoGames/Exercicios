package Ex2_Pokemons;

public class Terra extends Pokemon{

    public Terra(String nomes, int nivelDeVida, int forca) {
        super(nomes, nivelDeVida, forca);
    }

    @Override
    public void ataque(Pokemon atacado) {
        if(atacado instanceof Agua) {
            //Não da dano
            this.setNivelDeVida(this.getNivelDeVida() - 25);

        }else if(atacado instanceof Eletricidade) {
            //Não da dano
            this.setNivelDeVida(this.getNivelDeVida() - 25);

        }else if(atacado instanceof Fogo) {
            //Não da dano
            this.setNivelDeVida(this.getNivelDeVida() - 10);

        }else if(atacado instanceof Normais) {
            this.setNivelDeVida(this.getNivelDeVida() - 10);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 5);

        }else if(atacado instanceof Terra) {
            this.setNivelDeVida(this.getNivelDeVida() - 15);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }
    }
}