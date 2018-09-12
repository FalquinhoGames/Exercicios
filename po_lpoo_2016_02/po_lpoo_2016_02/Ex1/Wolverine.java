package Ex1;

import java.util.Calendar;

public class Wolverine extends SuperHeroi{
    /***************
     *  CONSTRUTOR *
     ***************/
    public Wolverine(String nomeOriginal, String descricao, Calendar dataDeCriacao, String paisNatal, int nivelDeResistencia, int estadoDeSaude) {
        super(nomeOriginal, descricao, dataDeCriacao, paisNatal, nivelDeResistencia, estadoDeSaude);
    }

    @Override
    public void machucar(SuperHeroi atacado) {
        if(atacado instanceof HomemDeFerro){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 1);

        } else if(atacado instanceof Wolverine){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 1);

        } else if(atacado instanceof Ciclope){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 1);

        } else if(atacado instanceof Coringa){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 1);
        }
    }

    @Override
    public void ajudar(SuperHeroi ajudado) {
        if(ajudado instanceof HomemDeFerro){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 20);

        } else if(ajudado instanceof Wolverine){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 20);

        } else if(ajudado instanceof Ciclope){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 20);

        } else if(ajudado instanceof Coringa){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 20);
        }
    }
}
