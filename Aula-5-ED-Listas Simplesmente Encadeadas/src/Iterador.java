import java.util.Iterator;

public class Iterador<T> implements Iterator{

    private Celula atual;

    public Iterador(Celula atual) {
        this.atual = atual;
    }
    
    
    public boolean hasNext() {
        if(atual!=null){
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        T elemento = (T) atual.getElemento();
        atual = atual.getProximo();
        return elemento;
    }

    public Celula getAtual() {
        return atual;
    }
}