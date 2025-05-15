import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciarArquivo {

    public static List<Registro> lerArquivo(String caminhoArquivo) {
        List<Registro> linhas = new ArrayList<>();
        linhas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" - ");
                Registro registro = new Registro(partes[0], partes[1], partes[2], partes[3]);
                linhas.add(registro);
            }
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return linhas;
    }

    public static void salvarEmArquivo(List<Registro> dados, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Registro linha : dados) {
                writer.write(linha.toString());
                writer.newLine();
            }
            System.out.println("Arquivo salvo com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
