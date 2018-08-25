package Ex5;

public abstract class Imovel {
    /**
     * Atributos
     */
    private String endereco;
    private double preco;

    /**
     * Getters e Setters
     */
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
