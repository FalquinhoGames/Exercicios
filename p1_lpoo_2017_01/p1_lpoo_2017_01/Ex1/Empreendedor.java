package Ex1;

import java.util.Calendar;
import java.util.Scanner;

public class Empreendedor {
    Scanner entrada = new Scanner(System.in);

    /*************
     * ATRIBUTOS *
     *************/
    private String nome;
    private String cpf;
    private String endereco;
    private Calendar data;
    private String ideia;

    /**************
     * CONSTRUTOR *
     **************/
    public Empreendedor(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Empreendedor(String nome, String cpf, String endereco, String ideia) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.ideia = ideia;
    }

    /***********
     * METODOS *
     ***********/
    public String nome(){
        if(this.nome.length() <= 30){
            return this.nome;
        }else{
            System.out.println("Nome com mais de 30 caracteres!");
            return null;
        }
    }
    public String cpf(){
        if(this.cpf.length() == 11) {
            return this.cpf;
        }else{
            System.out.printf("CPF inválido, digite novamente");
            return null;
        }
    }
}
