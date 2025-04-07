public class Celula<T> {

    private Celula proximo;
    private T elemento;

    public Celula() {
    }

    public Celula(T elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, T elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

}