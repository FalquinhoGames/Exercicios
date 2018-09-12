package Ex1;

import java.util.Calendar;

public abstract class SuperHeroi {
    /*************
     * ATRIBUTOS *
     *************/
    private String nomeOriginal;
    private String descricao;
    private Calendar dataDeCriacao;
    private String paisNatal;
    private int nivelDeResistencia;
    private int estadoDeSaude;

    /***************
     *  CONSTRUTOR *
     ***************/
    public SuperHeroi(String nomeOriginal, String descricao, Calendar dataDeCriacao,
                        String paisNatal, int nivelDeResistencia, int estadoDeSaude) {
        this.nomeOriginal = nomeOriginal;
        this.descricao = descricao;
        this.dataDeCriacao = dataDeCriacao;
        this.paisNatal = paisNatal;
        this.nivelDeResistencia = nivelDeResistencia;
        this.estadoDeSaude = estadoDeSaude;
    }

    /***********
     * METODOS *
     ***********/
    public abstract void machucar(SuperHeroi atacado);
    public abstract void ajudar(SuperHeroi ajudado);

    /*********************
     * GETTERS E SETTERS *
     *********************/
    public void setNivelDeResistencia(int nivelDeResistencia) {
        if(getNivelDeResistencia() > 0 || getNivelDeResistencia() < 100){
            this.nivelDeResistencia = nivelDeResistencia;
        }else if(getNivelDeResistencia() <= 0){
            System.out.println("Heroi sem resistencia!");
        } else{
            System.out.println("Valor de Resistencia invalido!");
        }
    }

    public int getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public void setEstadoDeSaude(int estadoDeSaude) {
        if(getEstadoDeSaude() > 0 || getNivelDeResistencia() <= 30){
            System.out.println("Estado de saude RUIM!");
            this.estadoDeSaude = estadoDeSaude;
        } else if(getEstadoDeSaude() >= 31 || getNivelDeResistencia() <= 70){
            System.out.println("Estado de saude BOM!");
            this.estadoDeSaude = estadoDeSaude;
        } else if(getEstadoDeSaude() >= 71 || getNivelDeResistencia() <= 100){
            System.out.println("Estado de saude EXCELENTE!");
            this.estadoDeSaude = estadoDeSaude;
        } else if(getEstadoDeSaude() <= 0){
            System.out.println("Heroi morto!");
        } else if(getEstadoDeSaude() > 100){
            System.out.println("Nivel de saude invalido");
        }
    }

    public int getEstadoDeSaude() {
        return estadoDeSaude;
    }
}
