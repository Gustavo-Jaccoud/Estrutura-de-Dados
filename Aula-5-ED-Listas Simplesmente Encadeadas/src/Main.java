public class Main {
    public static void main(String[] args) {
        // Criando uma lista de alunos
        ListaSimples<Aluno> lista = new ListaSimples<>();

        // Criando alguns objetos Aluno
        Aluno a1 = new Aluno("Inicio", 42);
        Aluno a2 = new Aluno("Meio", 21);
        Aluno a3 = new Aluno("Fim", 99);
        Aluno a4 = new Aluno("Novo", 33);

        // Adicionando elementos à lista
        lista.adicionaInicio(a1);
        lista.adicionaFim(a3);
        lista.adiciona(a2, 1);
        
        System.out.println("Lista após adições:");
        imprimirLista(lista);
        
        // Verificando se um elemento existe na lista
        System.out.println("O elemento a2 existe? " + lista.existeDado(a2));
        System.out.println("O elemento a4 existe? " + lista.existeDado(a4));
        
        // Recuperando elementos por posição
        System.out.println("Elemento na posição 0: " + lista.Recupera(0));
        System.out.println("Elemento na posição 1: " + lista.Recupera(1));
        System.out.println("Elemento na posição 2: " + lista.Recupera(2));
        
        // Testando remoções
        lista.removeInicio();
        System.out.println("Lista após remover início:");
        imprimirLista(lista);
        
        lista.removeFim();
        System.out.println("Lista após remover fim:");
        imprimirLista(lista);
        
        lista.adiciona(a4, 1);
        System.out.println("Lista após adicionar novo elemento na posição 1:");
        imprimirLista(lista);

        lista.adiciona(a1, 2);
        System.out.println("Lista após adicionar novo elemento na posição 2:");
        imprimirLista(lista);
        
        lista.remove(1);
        System.out.println("Lista após remover elemento na posição 1:");
        imprimirLista(lista);
        
        // Testando tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanho());
        
        // Limpando a lista
        lista.limpa();
        System.out.println("Lista após limpeza:");
        imprimirLista(lista);
        System.out.println("Tamanho da lista após limpeza: " + lista.tamanho());
    }
    
    public static void imprimirLista(ListaSimples<Aluno> lista) {
        if (lista.tamanho() == 0) {
            System.out.println("A lista está vazia!");
        } else {
            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(lista.Recupera(i));
            }
        }
    }
}
