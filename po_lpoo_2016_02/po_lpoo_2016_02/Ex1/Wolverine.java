package Ex1;

import java.util.Calendar;

public class Wolverine extends SuperHeroi{

    /***************
     *  CONSTRUTOR *
     ***************/
    public Wolverine(String nomeOriginal, String descricao, Calendar dataDeCriacao, String paisNatal, int nivelDeResistencia, int estadoDeSaude) {
        super(nomeOriginal, descricao, dataDeCriacao, paisNatal, nivelDeResistencia, estadoDeSaude);
    }

    /***********
     * METODOS *
     ***********/
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

    public double quantidadeAdamantium(double adamantium){
        if (adamantium >= 0){
            System.out.println("Quandidade de miligramas de adamantium é: %.2f" + adamantium);
            return adamantium;
        } else{
            System.out.println("Wolverine não pode ter valor negativo de adamantium :(");
            return Double.parseDouble(null);
        }
    }

    public int tempoCicatrizacao(int tempo){
        if (tempo >= 0){
            System.out.println("Tempo atual de sicatrização é de: " + tempo);
            return tempo;
        } else{
            System.out.println("Valor de cicatrização invalido");
            return Integer.parseInt(null);
        }
    }
}
