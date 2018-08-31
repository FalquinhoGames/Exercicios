package Ex2_Pokemons.Tipo_Pokemons;

import Ex2_Pokemons.Main_Pokemons.Pokemon;

public class Agua extends Pokemon{

    public Agua(String nomes, int nivelDeVida, int forca) {
        super(nomes, nivelDeVida, forca);
    }

    @Override
    public void ataque(Pokemon atacado) {
        if(atacado instanceof Agua) {
            this.setNivelDeVida(getNivelDeVida() - 15);
            atacado.setNivelDeVida(atacado.getNivelDeVida() - 10);

        }else if(atacado instanceof Eletricidade) {
            //Não da dano
            this.setNivelDeVida(this.getNivelDeVida() - 25);

        }else if(atacado instanceof Fogo) {
            //Não recebe dano
            atacado.setNivelDeVida(getNivelDeVida() - 25);

        }else if(atacado instanceof Normais) {
            //Não recebe dano
            atacado.setNivelDeVida(getNivelDeVida() - 10);

        }else if(atacado instanceof Terra) {
            //Não recebe dano
            atacado.setNivelDeVida(getNivelDeVida() - 25);
        }
    }
}