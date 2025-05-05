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

    private int hash(String senha) {
        return senha.hashCode() % tamanho;
    }

    public void cadastrar(Usuario usuario) {
        int indice = hash(usuario.getSenha());
        tabela[indice].adicionar(usuario);
    }

    public boolean autenticar(String senha, String email) {
        int indice = hash(senha);
        Usuario usuario = tabela[indice].buscar(email);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    public void remover(String email, String senha) {
        int indice = hash(senha);
        tabela[indice].remover(email, senha);
    }

    public boolean existe(String senha, String email) {
        int indice = hash(senha);
        Usuario usuario = tabela[indice].buscar(email);
        return usuario != null && usuario.getSenha().equals(senha);
    }
}
