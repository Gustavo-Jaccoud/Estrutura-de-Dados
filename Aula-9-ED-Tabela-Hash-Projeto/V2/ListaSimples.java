public class ListaSimples {
    private Celula inicio;

    public ListaSimples() {
        this.inicio = null;
    }

    public void adicionar(Usuario usuario) {
        Celula novaCelula = new Celula(usuario);
        novaCelula.setProximo(inicio);
        inicio = novaCelula;
    }

    public Usuario buscar(String nome) {
        Celula atual = inicio;
        while (atual != null) {
            if (atual.getUsuario().getNome().equals(nome)) {
                return atual.getUsuario();
            }
            atual = atual.getProximo();
        }
        return null; // Usuário não encontrado
    }

    public void remover(String senha) {
        Celula atual = inicio;
        Celula anterior = null;

        while (atual != null) {
            if (atual.getUsuario().getSenha().equals(senha)) { // Remover baseado na senha
                if (anterior == null) {
                    inicio = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}
