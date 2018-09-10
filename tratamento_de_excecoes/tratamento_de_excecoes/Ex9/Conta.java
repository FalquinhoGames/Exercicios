package Ex9;

public class Conta {
	private double limite;
	private double dinheiro;

	public Conta() {
	}

	/***********
	 * METODOS *
	 ***********/
	public void saca(double dinheiro) {
	    try {
            if (dinheiro > limite){
                throw new ContaException(limite, dinheiro);
            } else{
                limite = limite - dinheiro;
                System.out.println("Saldo: " + limite);
            }
        }catch (ContaException e) {
            System.out.println("não é possivel sacar essa quantia!");
        }
    }
	
	public void deposita(double dinheiro) {
	    this.dinheiro = dinheiro;
        System.out.println("Depositou: " + dinheiro);
    }
	/*******************
	 * GETTER E SETTER *
	 *******************/
	public void setLimite(double limite) {
	    this.limite = limite;
	    this.limite += this.dinheiro;
        System.out.println("limite agora: " + this.limite);
	}
}
