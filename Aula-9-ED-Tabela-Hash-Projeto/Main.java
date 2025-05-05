import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabelaHash tabela = new TabelaHash(10);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserção");
            System.out.println("2. Remoção");
            System.out.println("3. Busca");
            System.out.println("4. Login");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o email do usuário:");
                    String emailCadastro = scanner.nextLine();
                    System.out.println("Digite a senha do usuário:");
                    String senhaCadastro = scanner.nextLine();
                    Usuario novoUsuario = new Usuario(emailCadastro, senhaCadastro);
                    tabela.cadastrar(novoUsuario);
                    System.out.println("Usuário cadastrado!");
                    break;

                case 2:
                    System.out.println("Digite o email do usuário para remoção:");
                    String emailRemocao = scanner.nextLine();
                    System.out.println("Digite o senha do usuário para remoção:");
                    String senhaRemocao = scanner.nextLine();
                    tabela.remover(emailRemocao, senhaRemocao);
                    System.out.println("Usuário removido!");
                    break;

                case 3:
                    System.out.println("Digite o email do usuário para busca:");
                    String emailBusca = scanner.nextLine();
                    System.out.println("Digite a senha do usuário para busca:");
                    String senhaBusca = scanner.nextLine();
                    if (tabela.existe(senhaBusca, emailBusca)) {
                        System.out.println("Usuário encontrado!");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o email do usuário:");
                    String emailLogin = scanner.nextLine();
                    System.out.println("Digite a senha do usuário:");
                    String senhaLogin = scanner.nextLine();

                    if (tabela.autenticar(senhaLogin, emailLogin)) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Falha no login. email ou senha incorretos.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
