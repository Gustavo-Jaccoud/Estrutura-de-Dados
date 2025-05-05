public class Celula {
    private Usuario usuario;
    private Celula proximo;

    public Celula(Usuario usuario) {
        this.usuario = usuario;
        this.proximo = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
