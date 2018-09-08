package Ex7;

import java.util.Date;

public class Colecionavel {
    private static int idGlobal;
    private int id;
    private String nomes;
    private Date data;
    private String[] autores;

    public Colecionavel() {
    }

    public Colecionavel(String nomes, Date data, String[] autores) {
        super();
        this.id = idGlobal;
        idGlobal++;

        this.nomes = nomes;
        this.data = data;
        this.autores = autores;
    }

    public int getId() {
        return id;
    }
    public String getNomes() {
        return nomes;
    }
    public Date getData() {
        return data;
    }
    public String[] getAutores() {
        return autores;
    }
}
