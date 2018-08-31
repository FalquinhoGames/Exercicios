package Ex4.Animal;

public class Gato extends Animal{

    public Gato() {
    }

    @Override
    public void caminha() {
        System.out.println("Corredo");
    }

    public void mia(){
        System.out.println("Miauuuu");
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setRaca(String raca) {
        super.setRaca(raca);
    }
}
