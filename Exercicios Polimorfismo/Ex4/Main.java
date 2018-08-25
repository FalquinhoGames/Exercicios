package Ex4;

import Ex4.Animal.Cachorro;
import Ex4.Animal.Gato;
import Ex4.Pessoa.Miseravel;
import Ex4.Pessoa.Pobre;
import Ex4.Pessoa.Rica;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Rica rica = new Rica();
        Pobre pobre = new Pobre();
        Miseravel miseravel = new Miseravel();

        //Cachorro
        System.out.println("Cachorro:");
        dog.setNome("Bolinha");
        dog.setRaca("Vira-lata");
        dog.caminha();
        dog.late();

        //Gato
        System.out.println("\nGato:");
        cat.setNome("Bebe");
        cat.setRaca("Vira-lata");
        cat.caminha();
        cat.mia();

        //Pessoa Rica
        System.out.println("\nPessoa Rica:");
        rica.setNomes("Lucas");
        rica.setIdade(28);
        rica.setDinheiro(1000000);
        rica.fazCompras();

        //Pessoa Pobre
        System.out.println("\nPessoa Pobre:");
        pobre.setNomes("Biruta");
        pobre.setIdade(38);
        pobre.trabalha();

        //Pessoa Miseravel
        System.out.println("\nPessoa Miseravel:");
        miseravel.setNomes("Robertinho da quebrada");
        miseravel.setIdade(50);
        miseravel.mendiga();
    }
}
