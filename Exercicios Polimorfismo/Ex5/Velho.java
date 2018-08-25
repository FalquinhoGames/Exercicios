package Ex5;

public class Velho extends Imovel{
    @Override
    public void setEndereco(String endereco) {
        System.out.println("Endereco: " + endereco);
        super.setEndereco(endereco);
    }

    @Override
    public void setPreco(double preco) {
        System.out.println("Preco antigo: " + preco);
        super.setPreco(preco);
    }

    public void novoPreco(double novoPreco) {
        novoPreco = getPreco() - novoPreco;
        System.out.println("Novo preco e: " + novoPreco);
    }
}
