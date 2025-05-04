package t;
public class Celula {

    private Celula proximo;
    private Usuario elemento;

    public Celula() {
    }

    public Celula(Usuario elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, Usuario elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Usuario getElemento() {
        return elemento;
    }

    public void setElemento(Usuario elemento) {
        this.elemento = elemento;
    }

}