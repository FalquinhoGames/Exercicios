package Ex2_Pokemons.Tipo_Pokemons;

import Ex2_Pokemons.Main_Pokemons.Pokemon;

public class Terra extends Pokemon{

    public Terra(String nomes, int nivelDeVida, int forca) {
        super(nomes, nivelDeVida, forca);
    }

    @Override
    public void ataque(Pokemon atacado) {
        if(atacado instanceof Agua) {

        }else if(atacado instanceof Eletricidade) {

        }else if(atacado instanceof Fogo) {

        }else if(atacado instanceof Normais) {

        }else if(atacado instanceof Terra) {

        }
    }
}