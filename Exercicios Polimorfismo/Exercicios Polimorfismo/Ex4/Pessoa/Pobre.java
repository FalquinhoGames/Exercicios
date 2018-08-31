package Ex4.Pessoa;

public class Pobre extends Pessoa{

    public Pobre() {
    }

    public void trabalha(){
        System.out.println("Estou trabalhando :|");
    }

    @Override
    public void setNomes(String nomes) {
        super.setNomes(nomes);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }
}
