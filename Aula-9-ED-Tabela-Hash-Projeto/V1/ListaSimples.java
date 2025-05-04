package t;
public class ListaSimples {

    private Celula inicio, fim;
    private int tamanho;

    public ListaSimples(Usuario elemento) {
        this.inicio = null;
        this.fim = null;
        Celula nova = new Celula(elemento);
        inicio = fim = nova;
        this.tamanho += 1;

    }

    public Celula getInicio() {
        return inicio;
    }

    public void adicionaFim(Usuario elemento) {
        Celula nova = new Celula(elemento);
        if (tamanho == 0) {
            inicio = fim = nova;
        } else {
            fim.setProximo(nova);
            fim = nova;
        }
        tamanho++;
    }

    public void remove(Usuario elemento) {
        if (inicio == null)
            return; // Lista vazia

        // Se o elemento a ser removido for o primeiro
        if (inicio.getElemento().equals(elemento)) {
            inicio = inicio.getProximo();
            tamanho--;
            return;
        }

        Celula atual = inicio;
        while (atual.getProximo() != null) {
            if (atual.getProximo().getElemento().equals(elemento)) {
                atual.setProximo(atual.getProximo().getProximo());
                tamanho--;
                return;
            }
            atual = atual.getProximo();
        }
    }
}
