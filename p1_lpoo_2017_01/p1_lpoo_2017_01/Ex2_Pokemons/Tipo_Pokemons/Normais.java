package Ex2_Pokemons.Tipo_Pokemons;

import Ex2_Pokemons.Main_Pokemons.Pokemon;

public class Normais extends Pokemon{

    public Normais(String nomes, int nivelDeVida, int forca) {
        super(nomes, nivelDeVida, forca);
    }

    @Override
    public void ataque(Pokemon atacado) {
        if(atacado instanceof Agua) {
            //Não da dano
            this.setNivelDeVida(getNivelDeVida() - 10);

        }else if(atacado instanceof Eletricidade) {
            //Não da dano
            this.setNivelDeVida(getNivelDeVida() - 10);

        }else if(atacado instanceof Fogo) {
            this.setNivelDeVida(getNivelDeVida() - 5);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }else if(atacado instanceof Normais) {
            this.setNivelDeVida(getNivelDeVida() - 15);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }else if(atacado instanceof Terra) {
            //Não da dano
            this.setNivelDeVida(getNivelDeVida() - 10);

        }
    }
}