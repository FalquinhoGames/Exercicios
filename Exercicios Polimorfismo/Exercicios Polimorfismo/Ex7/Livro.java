package Ex7;

import java.util.Date;

public class Livro extends Colecionavel{

    private String nomeDaEditora;
    private int ano;

    public Livro(String nomes, Date data, String[] autores, String nomeDaEditora, int ano) {
        super(nomes, data, autores);
        this.nomeDaEditora = nomeDaEditora;
        this.ano = ano;
    }
}
