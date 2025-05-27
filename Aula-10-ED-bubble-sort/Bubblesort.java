import java.util.ArrayList;

public class Bubblesort {
    public static ArrayList<Empresa> bubblesort(ArrayList<Empresa> empresas) {
        long contatador = 0;
        for (int i = 0; i < empresas.size(); i++) {
            for (int j = 1; j < empresas.size(); j++) {
                double valorAnterior = empresas.get(j - 1).getValorDeMercado();
                double valorAtual = empresas.get(j).getValorDeMercado();

                if (valorAnterior < valorAtual) {
                    Empresa tmp = empresas.get(j - 1);
                    empresas.set(j - 1, empresas.get(j));
                    empresas.set(j, tmp);
                }
                System.out.println("-> " + contatador);
                contatador++;
            }
        }
        System.out.println("total de vezes: " + contatador);
        return empresas;
    }

}
