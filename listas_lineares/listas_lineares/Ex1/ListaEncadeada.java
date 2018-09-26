package Ex1;

public class ListaEncadeada {

    private Celula c;
    private ListaEncadeada prox;

    public ListaEncadeada() {
    }

    public Celula getC() {
        return c;
    }

    public void setC(Celula c) {
        this.c = c;
    }

    public ListaEncadeada getProx() {
        return prox;
    }

    public void setProx(ListaEncadeada prox) {
        this.prox = prox;
    }
}
