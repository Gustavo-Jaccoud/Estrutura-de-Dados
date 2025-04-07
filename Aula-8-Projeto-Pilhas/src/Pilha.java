public class Pilha<T> {

    private Celula<T> inicio, fim;
    private int tamanho;

    public Pilha() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public Pilha(T elemento) {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.adiciona(elemento);

    }

    public Celula<T> celulaTopo() {
        if (inicio != null) {
            return inicio;
        }
        return null;

    }

    public T topo() {
        if (inicio != null) {
            return inicio.getElemento();
        }
        return null;

    }

    public void adiciona(T elemento) {
        Celula<T> nova = new Celula<>(elemento);
        nova.setProximo(inicio); // Aponta para o antigo topo
        inicio = nova; // Novo topo
        if (tamanho == 0) {
            fim = nova; // Só no primeiro elemento
        }
        tamanho++;
    }

    public void remove() {
        if (tamanho == 0)
            return;

        Celula<T> removida = inicio;
        inicio = inicio.getProximo();
        removida.setProximo(null); // Boa prática

        tamanho--;

        if (tamanho == 0) {
            fim = null;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public void limpa() {
        this.inicio = this.fim = null;
        this.tamanho = 0;
    }
}
