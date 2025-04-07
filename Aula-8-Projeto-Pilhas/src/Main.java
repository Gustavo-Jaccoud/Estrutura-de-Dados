import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("""
                    -----------------------
                    | 1- Visitar Página   |
                    | 2- Voltar           |
                    | 3- Avançar          |
                    | 4- Exibir Historico |
                    | 5- Sair             |
                    -----------------------
                    Escolha uma opção:
                    """);
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Insira a pagina visitada:");
                    String url = scanner.nextLine();
                    navegador.visitarPagina(url);
                    break;

                case "2":
                    var paginaVolta = navegador.voltar();
                    if (paginaVolta != null) {
                        System.out.println("|- " + paginaVolta);
                    }
                    break;

                case "3":
                    var paginaAvanca = navegador.avancar();
                    if (paginaAvanca != null) {
                        System.out.println("|- " + paginaAvanca);
                    }
                    break;

                case "4":
                    navegador.exibirHistorico();
                    break;

                case "5":
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        } while (opcao != "5");
        scanner.close();

    }

}
