import java.util.Scanner;

// Classe que representa cada elemento da pilha
class No {
    String valor;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

// Implementação da Pilha dinâmica
class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(String valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public String pop() {
        if (isEmpty())
            return null;
        String valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public String peek() {
        return isEmpty() ? null : topo.valor;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void exibir() {
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}

public class Navegador {
    private Pilha backStack = new Pilha();
    private Pilha forwardStack = new Pilha();
    private String paginaAtual = null;

    public void visitarPagina(String url) {
        if (paginaAtual != null) {
            backStack.push(paginaAtual);
        }
        paginaAtual = url;
        forwardStack = new Pilha(); // limpa o histórico de avanço
        System.out.println("Visitando: " + paginaAtual);
    }

    public void voltar() {
        if (backStack.isEmpty()) {
            System.out.println("Não há páginas anteriores.");
            return;
        }
        forwardStack.push(paginaAtual);
        paginaAtual = backStack.pop();
        System.out.println("Voltando para: " + paginaAtual);
    }

    public void avancar() {
        if (forwardStack.isEmpty()) {
            System.out.println("Não há páginas futuras para avançar.");
            return;
        }
        backStack.push(paginaAtual);
        paginaAtual = forwardStack.pop();
        System.out.println("Avançando para: " + paginaAtual);
    }

    public void exibirHistorico() {
        System.out.println("\n--- Histórico de Navegação ---");
        backStack.exibir();
        if (paginaAtual != null) {
            System.out.println("[Atual] -> " + paginaAtual);
        }
        System.out.println("--------------------------------\n");
    }

    // Menu principal
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU DO NAVEGADOR =====");
            System.out.println("1. Visitar nova página");
            System.out.println("2. Voltar");
            System.out.println("3. Avançar");
            System.out.println("4. Exibir histórico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL da nova página: ");
                    String url = scanner.nextLine();
                    navegador.visitarPagina(url);
                    break;
                case 2:
                    navegador.voltar();
                    break;
                case 3:
                    navegador.avancar();
                    break;
                case 4:
                    navegador.exibirHistorico();
                    break;
                case 0:
                    System.out.println("Saindo do navegador...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
