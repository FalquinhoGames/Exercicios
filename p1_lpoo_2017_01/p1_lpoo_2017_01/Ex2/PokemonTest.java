package Ex2;

public class PokemonTest {
    public static void main(String[] args) {
    	
    	Agua agua = new Agua("Ronaldo", 100, 50);
    	Eletricidade eletricidade = new Eletricidade("Robson", 100, 50);
    	Fogo fogo = new Fogo("Lucas", 100, 50);
    	Normais normais = new Normais("Marcus", 100, 50);
    	Terra terra = new Terra("Crys", 100, 50);

    	agua.ataque(fogo);
        System.out.println("Agua: " + agua.getNivelDeVida());
        System.out.println("Fogo: " + fogo.getNivelDeVida());
    }
}