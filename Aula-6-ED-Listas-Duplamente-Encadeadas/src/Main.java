public class Main {
    public static void main(String[] args) {
        // Criando uma lista de alunos
        ListaDupla<Aluno> lista = new ListaDupla<>();

        // Criando alguns objetos Aluno
        Aluno a1 = new Aluno("Pedro", 42);
        Aluno a2 = new Aluno("Maria", 21);
        Aluno a3 = new Aluno("Jose", 99);
        

   
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaInicio(a3);
        System.out.println("Lista após adições:");
        imprimirLista(lista);

        Aluno a4 = new Aluno("Carlos", 33);
        System.out.println("Lista após adição no meio:");
        lista.adiciona(a4, 1);
        imprimirLista(lista);


        
        Aluno a5 = new Aluno("Gustavo", 22);
        System.out.println("Lista após adição fim:");
        lista.adicionaFim(a5);
        imprimirLista(lista);
        
        System.out.println("Existe o aluno a5 na lista?");
        System.out.println(lista.existeDado(a5));

        System.out.println("Recuperar aluno na posição 2");
        System.out.println(lista.Recupera(2));

        System.out.println("Remover aluno do inicio");
        lista.removeInicio();
        imprimirLista(lista);

        System.out.println("Remover aluno do fim");
        lista.removeFim();
        imprimirLista(lista);

        System.out.println("Remover aluno na posição 1");
        lista.remove(1);
        imprimirLista(lista);

        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.limpa();
        System.out.println("Tamanho da lista apos limpeza: " + lista.tamanho());

    }
    public static void imprimirLista(ListaDupla<Aluno> lista) {
        if (lista.tamanho() == 0) {
            System.out.println("A lista está vazia!");
        } else {
            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println(lista.Recupera(i));
            }
        }
    }
}
