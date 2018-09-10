package Ex9;

public class ContaException extends Exception{

    private double limite;
    private double dinheiro;

    public ContaException(double limite, double dinheiro) {
        this.limite = limite;
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "não é possivel sacar essa quantia!";
    }
}
