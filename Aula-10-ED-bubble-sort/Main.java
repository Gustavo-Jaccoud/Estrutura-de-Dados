import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = GerenciarArquivo.lerArquivo("Empresas_BubbleSort.txt");

        empresas = Bubblesort.bubblesort(empresas);

        GerenciarArquivo.salvarEmArquivo(empresas, "Empresas_BubbleSort_novo.txt");
    }

}