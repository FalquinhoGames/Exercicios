package Ex7;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String autores[] = new String[4];
        autores[0] = "wallace";
        autores[1] = "Jonildo";
        autores[2] = "Chacrinha";
        autores[3] = "baibe";

        String faixa[] = new String[2];
        faixa[0] = "jjkeeecj";

        Colecionavel colecionavel1 = new Colecionavel("Livro velho", new Date(1987, 12, 03), autores);
        Cd cd = new Cd("Cd novo", new Date(2000, 9, 25), autores, "Pop", faixa);
        Colecionavel colecionavel3 = new Colecionavel("Livro velhote", new Date(1987, 12, 03), autores);
        Colecionavel colecionavel4 = new Colecionavel("Livro novao", new Date(1987, 12, 03), autores);

        System.out.println(colecionavel1.getId());
        System.out.println(cd.toString());
        System.out.println(colecionavel3.getId());
        System.out.println(colecionavel4.getId());

    }

}
