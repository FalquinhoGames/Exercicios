package Ex2;

public abstract class Pokemon {
    private String nomes;
    private int nivelDeVida;
    private int forca;

    public Pokemon(String nomes, int nivelDeVida, int forca) {
        this.nomes = nomes;
        this.nivelDeVida = nivelDeVida;
        this.forca = forca;
    }

    public abstract void ataque(Pokemon atacado);

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }
}