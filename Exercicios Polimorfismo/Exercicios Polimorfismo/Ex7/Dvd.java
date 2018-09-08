package Ex7;

import java.util.Date;

public class Dvd extends Colecionavel{

    private String tipo;
    private String descricao;

    public Dvd(String nomes, Date data, String[] autores, String tipo, String descricao) {
        super(nomes, data, autores);
        this.tipo = tipo;
        this.descricao = descricao;
    }
}
