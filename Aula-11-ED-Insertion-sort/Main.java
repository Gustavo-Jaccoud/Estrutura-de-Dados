import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Registro> linhas = GerenciarArquivo.lerArquivo("corridas.txt");

        linhas = InsertionSort.insertionSort(linhas);

        GerenciarArquivo.salvarEmArquivo(linhas, "corridas_nova.txt");
    }
}