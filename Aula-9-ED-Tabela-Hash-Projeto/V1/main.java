package t;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabelaHash<Usuario> tabela = new TabelaHash<>(10);

        int opcao;
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Verificar usuário");
            System.out.println("3 - Remover usuário");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Login: ");
                    String loginAdd = scanner.nextLine();
                    System.out.print("Senha (número): ");
                    int senhaAdd = scanner.nextInt();
                    scanner.nextLine();
                    tabela.adiciona(new Usuario(loginAdd, senhaAdd));
                    System.out.println("Usuário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Login: ");
                    String loginVer = scanner.nextLine();
                    System.out.print("Senha (número): ");
                    int senhaVer = scanner.nextInt();
                    scanner.nextLine();
                    boolean existe = tabela.verificaUsuario(new Usuario(loginVer, senhaVer));
                    if (existe) {
                        System.out.println("Usuário encontrado.");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Login: ");
                    String loginRem = scanner.nextLine();
                    System.out.print("Senha (número): ");
                    int senhaRem = scanner.nextInt();
                    scanner.nextLine();
                    tabela.remove(new Usuario(loginRem, senhaRem));
                    System.out.println("Usuário removido (se existia).");
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
