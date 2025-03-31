public class Celula {

    private Celula anterior;
    private Celula proximo;
    private Object elemento;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula anterior, Celula proximo, Object elemento) {
        this.anterior = anterior;
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}