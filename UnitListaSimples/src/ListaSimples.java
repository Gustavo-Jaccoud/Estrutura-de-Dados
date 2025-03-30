public class ListaSimples<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public ListaSimples(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.adicionaInicio(elemento);
    
    }

    public void adiciona(T elemento, int posicao) {
        Celula nova = new Celula(elemento);
        if (posicao < 0 || tamanho < posicao) {
            System.out.println("Posição invalida");
        }
        else if(posicao == 0){
            adicionaInicio(elemento);
        }
        else if(posicao == this.tamanho){
            adicionaFim(elemento);
        }
        else{
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i == posicao-1) {
                    break;
                } 
                it.next();
                i++;
            }
            nova.setProximo(it.getAtual().getProximo());
            it.getAtual().setProximo(nova);
            this.tamanho++;
        }

    }

    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }

    public void adicionaFim(T elemento) {
        Celula nova = new Celula(elemento);
        if (tamanho == 0) {
            inicio = fim = nova;
        } else {
            fim.setProximo(nova);
            fim = nova;
        }
        tamanho++;    
    }
    
    public boolean existeDado(T elemento){
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return false;
            
        } else {

            Iterador it = new Iterador(this.inicio);

            while (it.hasNext()) {
                if (it.getAtual().getElemento().equals(elemento)) {
                   return true;
                } 
                it.next();
            }
            return false;
        }
       
    }

    public T Recupera(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
    
    public void remove(int posicao) {
        if(posicao == 0){
            removeInicio();
        }
        else if(posicao == tamanho - 1){
            removeFim();
        } else if(posicao>=tamanho){
            System.out.println("Posição invalida");
        }
        else{
        Iterador it = new Iterador(this.inicio);
            int i = posicao - 1;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            it.getAtual().setProximo(it.getAtual().getProximo().getProximo());
    }
}

    public void removeInicio() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public void removeFim() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {

            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i == tamanho-2) {
                    break;
                } 
                it.next();
                i++;
            }
            it.getAtual().setProximo(null);
            this.fim = it.getAtual();
            this.tamanho -= 1;
            
        }
}
    
    public int tamanho(){
        return tamanho;
    }
    
    public void limpa(){
       this.inicio = this.fim = null;
       this.tamanho = 0;
    }
}


