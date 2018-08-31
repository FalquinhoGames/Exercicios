package Ex4.Pessoa;

public class Rica extends Pessoa{
    private double dinheiro;

    public Rica() {
    }

    public void fazCompras(){
        System.out.println("Estou gastando meus rios de dinheiro >:D");
    }

    @Override
    public void setNomes(String nomes) {
        super.setNomes(nomes);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    public void setDinheiro(double dinheiro) {
        System.out.println(dinheiro);
        this.dinheiro = dinheiro;
    }
}
