package Ex7;

import java.util.Date;

public class Revista extends Colecionavel{

    private int ano;
    private int volume;
    private String editora;
    private String assuntos;

    public Revista(String nomes, Date data, String[] autores, int ano, int volume, String editora, String assuntos) {
        super(nomes, data, autores);
        this.ano = ano;
        this.volume = volume;
        this.editora = editora;
        this.assuntos = assuntos;
    }
}
