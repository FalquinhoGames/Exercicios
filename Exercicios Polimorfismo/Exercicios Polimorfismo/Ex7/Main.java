package Ex7;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String autores[] = new String[3];
        autores[0] = "wallace";
        autores[1] = "Jonildo";
        autores[2] = "Chacrinha";

        Colecionavel colecionavel1 = new Colecionavel("Livro velho", new Date(1987, 12, 03), autores);
        Colecionavel colecionavel2 = new Colecionavel("Livro novissiomo", new Date(1987, 12, 03), autores);
        Colecionavel colecionavel3 = new Colecionavel("Livro velhote", new Date(1987, 12, 03), autores);
        Colecionavel colecionavel4 = new Colecionavel("Livro novao", new Date(1987, 12, 03), autores);

        System.out.println(colecionavel1.getId());
        System.out.println(colecionavel2.getId());
        System.out.println(colecionavel3.getId());
        System.out.println(colecionavel4.getId());

    }

}
