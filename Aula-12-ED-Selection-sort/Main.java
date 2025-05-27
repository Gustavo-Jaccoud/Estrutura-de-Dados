import java.util.List;

class Main {
    public static void main(String[] args) {

        List<Aluno> linhas = GerenciarArquivo.lerArquivo("matriculas.txt");

        linhas = SelectionSort.selectionSort(linhas);

        GerenciarArquivo.salvarEmArquivo(linhas, "matriculas_nova.txt");
    }
}