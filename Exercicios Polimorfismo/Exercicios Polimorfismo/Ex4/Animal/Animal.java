package Ex4.Animal;

public abstract class Animal {
    //Atributos
    private String nome;
    private String raca;

    public Animal() {
    }

    //Metodos
    public abstract void caminha();

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println(nome);
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        System.out.println(raca);
        this.raca = raca;
    }
}
