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
    public void adiciona(T elemento, int posicao) {
        Celula nova = new Celula(elemento);
        if (posicao < 0 || tamanho < posicao) {
            System.out.println("Posição invalida");
        }
        else if(posicao == 0){
            adicionaInicio(elemento);
        }
        else if(posicao == this.tamanho){
            
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

    public boolean existeDado(T elemento){
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return false;
            
        } else {

            Iterador it = new Iterador(this.inicio);

            while (it.hasNext()) {
                if (it.getAtual().getElemento() == elemento) {
                   return true;
                } 
                it.next();
            }
            return false;
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


