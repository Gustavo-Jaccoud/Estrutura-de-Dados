import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = GerenciarArquivo.lerArquivo("pedidos.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU DE ORDENAÇÃO ===");
        System.out.println("Escolha um campo para ordenar os pedidos:");
        System.out.println("1 - Quantidade de Itens");
        System.out.println("2 - Status");
        System.out.println("3 - Método de Pagamento");
        System.out.println("4 - Cidade");
        System.out.println("5 - Data do Pedido");
        System.out.println("6 - Data da Entrega");
        System.out.println("7 - Valor");

        System.out.print("\nDigite o número da opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        String campo = "";
        String ordem = "crescente";

        switch (opcao) {
            case 1:
                campo = "itens";
                ordem = "decrescente";
                break;
            case 2:
                campo = "status";
                break;
            case 3:
                campo = "metodoPagamento";
                break;
            case 4:
                campo = "cidade";
                break;
            case 5:
                campo = "dataPedido";
                break;
            case 6:
                campo = "dataEntrega";
                break;
            case 7:
                campo = "valor";
                ordem = "decrescente";
                break;
            default:
                System.out.println("Opção inválida. Encerrando.");
                scanner.close();
                return;
        }

        System.out.println("\nOrdenando por '" + campo + "' em ordem " + ordem + "...\n");

        List<Pedido> pedidosOrdenados = Quicksort.quickSort(pedidos, campo, ordem);

        GerenciarArquivo.salvarEmArquivo(pedidosOrdenados, "pedidos_ordenados.txt");

        System.out.println("Pedidos ordenados salvos em 'pedidos_ordenados.txt'.");
        scanner.close();
    }
}
