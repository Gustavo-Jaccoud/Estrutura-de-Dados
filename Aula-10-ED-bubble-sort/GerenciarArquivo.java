import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciarArquivo {

    public static ArrayList<String[]> lerArquivo(String caminhoArquivo) {
        ArrayList<String[]> linhas = new ArrayList<>();
        linhas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" \\| ");
                linhas.add(partes);
            }
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return linhas;
    }

    public static void salvarEmArquivo(ArrayList<String[]> dados, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (String[] linha : dados) {
                // Escreve no formato: Empresa X | Código | Valor
                writer.write(linha[0] + " | " + linha[1] + " | " + linha[2]);
                writer.newLine(); // pula linha
            }
            System.out.println("Arquivo salvo com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
