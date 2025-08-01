import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciarArquivo {

    public static ArrayList<Empresa> lerArquivo(String caminhoArquivo) {
        ArrayList<Empresa> linhas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" \\| ");
                linhas.add(new Empresa(partes[0], partes[1], partes[2]));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return linhas;
    }

    public static void salvarEmArquivo(ArrayList<Empresa> empresas, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Empresa empresa : empresas) {
                writer.write(empresa.getNomeFantasia() + " | " + empresa.getInscricaoEstadual() + " | "
                        + empresa.getValorDeMercado());
                writer.newLine();
            }
            System.out.println("Arquivo salvo com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
