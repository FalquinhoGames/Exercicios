package Ex4.Pessoa;

public class Miseravel extends Pessoa{

    public Miseravel() {
    }

    public void mendiga(){
        System.out.println("Estou mendigando ;-;");
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
