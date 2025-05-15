import java.lang.reflect.Array;
import java.util.ArrayList;

class Main {
    public static void Main(String[] args) {

        ArrayList<String[]> linhas = GerenciarArquivo.lerArquivo("Empresas_BubbleSort.txt");

        linhas = Bubblesort.bubblesort(linhas);

        GerenciarArquivo.salvarEmArquivo(linhas, "Empresas_BubbleSort_novo.txt");

    }

}