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
        this.nivelDeResistencia = nivelDeResistencia;
    }

    public int getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public void setEstadoDeSaude(int estadoDeSaude) {
        this.estadoDeSaude = estadoDeSaude;
    }
}
