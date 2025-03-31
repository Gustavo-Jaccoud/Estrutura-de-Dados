import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

       Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------------------Menu---------------------");
            System.out.println("1. Adicionar nova tarefa;");
            System.out.println("2. Editar tarefas cadastrada;");
            System.out.println("3. Remover tarefas concluída;");
            System.out.println("4. Listar todas as tarefas pendentes;");
            System.out.println("5. Buscar uma tarefa específica;");
            System.out.println("6. Sair.");
            System.out.println("----------------------------------------------");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    toDoList.criarTarefa();
                    break;
                case 2:
                    toDoList.editarTarefa();
                    break;
                case 3:
                    toDoList.removerTarefa();
                    break;
                case 4:
                    toDoList.listarTarefas();
                    break;
                case 5:
                    toDoList.buscarTarefa();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while(opcao != 6); 

        scanner.close();
    }

    }

