package Ex1;

import java.util.Calendar;

public class HomemDeFerro extends SuperHeroi{

    /***************
     *  CONSTRUTOR *
     ***************/
    public HomemDeFerro(String nomeOriginal, String descricao, Calendar dataDeCriacao, String paisNatal, int nivelDeResistencia, int estadoDeSaude) {
        super(nomeOriginal, descricao, dataDeCriacao, paisNatal, nivelDeResistencia, estadoDeSaude);
    }

    /***********
     * METODOS *
     ***********/
    @Override
    public void machucar(SuperHeroi atacado) {
        if(atacado instanceof HomemDeFerro){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 20);

        } else if(atacado instanceof Wolverine){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 20);

        } else if(atacado instanceof Ciclope){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 20);

        } else if(atacado instanceof Coringa){
            atacado.setNivelDeResistencia(atacado.getNivelDeResistencia() - 20);
        }
    }

    @Override
    public void ajudar(SuperHeroi ajudado) {
        if(ajudado instanceof HomemDeFerro){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 5);

        } else if(ajudado instanceof Wolverine){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 5);

        } else if(ajudado instanceof Ciclope){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 5);

        } else if(ajudado instanceof Coringa){
            this.setNivelDeResistencia(this.getNivelDeResistencia() + 5);
        }
    }

    public int versaoArmadura(int versao){
        if(versao >= 1 || versao <= 10){
            System.out.println("versão da armadura é: " + versao);
            return versao;
        } else{
            return Integer.parseInt(null);
        }
    }

    public int quantidadeNamoradas(int namoras){
        if(namoras >= 0){
            return namoras;
        } else{
            System.out.println("Valor de namoradas não é valido para o queridão Homem de Ferro");
            return Integer.parseInt(null);
        }
    }
}
