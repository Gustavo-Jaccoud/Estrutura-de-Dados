public class TabelaHash {
    private ListaSimples[] tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        tabela = new ListaSimples[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new ListaSimples();
        }
    }

    // O hash agora será baseado na senha (que é uma string)
    private int hash(String senha) {
        return senha.hashCode() % tamanho; // Utilizando o hashCode da senha
    }

    public void cadastrar(Usuario usuario) {
        int indice = hash(usuario.getSenha()); // O hash é feito pela senha
        tabela[indice].adicionar(usuario);
    }

    public boolean autenticar(String senha, String nome) {
        int indice = hash(senha); // O hash é feito pela senha
        Usuario usuario = tabela[indice].buscar(nome); // Buscamos pelo nome do usuário
        return usuario != null && usuario.getSenha().equals(senha); // Verificamos se a senha corresponde
    }

    public void remover(String senha) {
        int indice = hash(senha); // O hash é feito pela senha
        tabela[indice].remover(senha); // Removemos o usuário com base na senha
    }

    public boolean existe(String senha) {
        int indice = hash(senha); // O hash é feito pela senha
        return tabela[indice].buscar(senha) != null;
    }
}
