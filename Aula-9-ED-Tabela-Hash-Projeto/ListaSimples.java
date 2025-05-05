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

    public Usuario buscar(String email) {
        Celula atual = inicio;
        while (atual != null) {
            if (atual.getUsuario().getEmail().equals(email)) {
                return atual.getUsuario();
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void remover(String email, String senha) {
        Celula atual = inicio;
        Celula anterior = null;

        while (atual != null) {
            if (atual.getUsuario().getEmail().equals(email) && atual.getUsuario().getSenha().equals(senha)) {
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
