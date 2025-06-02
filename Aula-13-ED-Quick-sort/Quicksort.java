import java.util.List;

public class Quicksort {

    public static List<Pedido> quickSort(List<Pedido> pedidos, String ordenarPor, String ordem) {
        boolean decrescente = ordem.equalsIgnoreCase("decrescente");
        ordenar(pedidos, ordenarPor, 0, pedidos.size() - 1, decrescente);
        return pedidos;
    }

    private static void ordenar(List<Pedido> lista, String chave, int inicio, int fim, boolean decrescente) {
        if (inicio < fim) {
            int pivoIndex = particionar(lista, chave, inicio, fim, decrescente);
            ordenar(lista, chave, inicio, pivoIndex - 1, decrescente);
            ordenar(lista, chave, pivoIndex + 1, fim, decrescente);
        }
    }

    private static int particionar(List<Pedido> lista, String chave, int inicio, int fim, boolean decrescente) {
        int meio = inicio + (fim - inicio) / 2;
        trocar(lista, meio, fim);

        Object pivo = lista.get(fim).getValorPorChave(chave);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            Object atual = lista.get(j).getValorPorChave(chave);

            if (comparar(atual, pivo, decrescente)) {
                i++;
                trocar(lista, i, j);
            }
        }

        trocar(lista, i + 1, fim);
        return i + 1;
    }

    private static void trocar(List<Pedido> lista, int i, int j) {
        Pedido temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }

    private static boolean comparar(Object a, Object b, boolean decrescente) {
        if (a == null || b == null)
            return false;

        int resultado = 0;

        if (a instanceof Integer && b instanceof Integer) {
            resultado = Integer.compare((Integer) a, (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            resultado = Double.compare((Double) a, (Double) b);
        } else if (a instanceof String && b instanceof String) {
            resultado = ((String) a).compareToIgnoreCase((String) b);
        } else if (a instanceof java.time.LocalDateTime && b instanceof java.time.LocalDateTime) {
            resultado = ((java.time.LocalDateTime) a).compareTo((java.time.LocalDateTime) b);
        } else {
            resultado = a.toString().compareToIgnoreCase(b.toString());
        }

        return decrescente ? resultado > 0 : resultado < 0;
    }
}
