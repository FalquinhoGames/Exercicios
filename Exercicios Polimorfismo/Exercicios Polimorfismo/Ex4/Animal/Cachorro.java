package Ex4.Animal;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    @Override
    public void caminha() {
        System.out.println("Corredo");
    }

    public void late(){
        System.out.println("Au Au!");
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
