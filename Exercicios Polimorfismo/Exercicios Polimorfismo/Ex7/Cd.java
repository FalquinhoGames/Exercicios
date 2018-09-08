package Ex7;

import java.io.PrintStream;
import java.util.Date;

/** TODO
 *  pode apresentar problema!
 *  numero de faixas sera limitada
 *  por conta de ser um vetor de String
 */

public class Cd extends Colecionavel{

    Colecionavel colecionavel = new Colecionavel();

    private String genero;
    private String[] faixas;

    public Cd(String nomes, Date data, String[] autores, String genero, String[] faixas) {
        super(nomes, data, autores);
        this.genero = genero;
        this.faixas = faixas;
    }

    public String toString(){
        return "Nome: " + colecionavel.getNomes() + "\nData: " + colecionavel.getData() + "\nAutores: " + colecionavel.getAutores()
                + "\nGenero: " + genero + "\nFaixa: " + faixas;
    }
}
