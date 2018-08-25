package Ex4.Pessoa;

public class Pessoa {
    private String nomes;
    private int idade;

    public Pessoa() {
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        System.out.println(nomes);
        this.nomes = nomes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        System.out.println(idade);
        this.idade = idade;
    }
}
