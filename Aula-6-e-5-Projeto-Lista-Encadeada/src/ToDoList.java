import java.util.Scanner;

public class ToDoList {

    ListaDupla lista = new ListaDupla<>();

    Scanner scanner = new Scanner(System.in);

    
    public void criarTarefa(){
        System.out.println("----------------------------------------------");
        System.out.println("Digite a Descrição da tarefa");
        String descricao = scanner.nextLine();
        lista.adicionaInicio(new Tarefa(descricao));
        System.out.println("Tarefa Adicionada");
    }

    public void editarTarefa(){
        listarTarefas();
        System.out.println("----------------------------------------------");
        System.out.println("Digite o numero da tarefa que deseja alterar:");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        if (posicao-1>= lista.tamanho()){
            System.out.println("Posição Invalida");
            return;
        }

        Tarefa tarefa = (Tarefa) lista.Recupera(posicao-1);
        System.out.println("----------------------------------------------");
        System.out.println("Descrição Atual da tarefa:");
        System.out.println(tarefa.getDescricao());
        System.out.println("----------------------------------------------");
        System.out.println("Digite a nova Descrição da tarefa?");
        String descricao = scanner.nextLine();

        tarefa.setDescricao(descricao);
        System.out.println("Alteração realizada!");
    }

    public void removerTarefa(){
        listarTarefas();
        System.out.println("----------------------------------------------");
        System.out.println("Digite o numero da tarefa que deseja concluir:");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        lista.remove(posicao-1);
        System.out.println("Tarefa concluida");
    }

    public void listarTarefas(){
        if (lista.tamanho() == 0) {
            System.out.println("O To do list está vazio!");
        } else {
            System.out.println("------------------To Do List------------------");
            for (int i = 0; i < lista.tamanho(); i++) {
                Tarefa tarefa = (Tarefa) lista.Recupera(i);
                System.out.println("... "+ (i+1) +" | " + tarefa.getDescricao());
            }
        }
    }
    public void buscarTarefa(){
        System.out.println("Digite o numero da tarefa que deseja visualizar:");
        int posicao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("----------------------------------------------");
        Tarefa tarefa = (Tarefa) lista.Recupera(posicao-1);
        System.out.println("... "+ (posicao) + " | " + tarefa.getDescricao());

    }
    }
