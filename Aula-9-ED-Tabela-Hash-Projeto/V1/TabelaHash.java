package t;

public class TabelaHash<T> {

    private int tamanho;
    private ListaSimples[] tabelaHash;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        tabelaHash = new ListaSimples[tamanho];
    }

    public void adiciona(Usuario elemento) {
        ListaSimples nova = new ListaSimples(elemento);
        int hash = hashMethod(elemento.getSenha());

        if (tabelaHash[hash] == null) {
            tabelaHash[hash] = nova;
        } else {
            tabelaHash[hash].adicionaFim(elemento);
        }
    }

    public boolean verificaUsuario(Usuario elemento) {
        ListaSimples lista = tabelaHash[hashMethod(elemento.getSenha())];
        if (lista == null) {

            return false;

        } else {
            if (lista.getInicio().getElemento().getLogin() == elemento.getLogin()
                    && lista.getInicio().getElemento().getSenha() == elemento.getSenha()) {
                return true;
            }

            Iterador it = new Iterador(lista.getInicio());
            while (it.hasNext()) {
                if (it.getAtual().getElemento().getLogin() == elemento.getLogin()
                        && it.getAtual().getElemento().getSenha() == elemento.getSenha()) {

                    return true;
                }
                it.next();
            }
            return false;
        }

    }

    public void remove(Usuario usuario) {
        if (verificaUsuario(usuario)) {
            tabelaHash[hashMethod(usuario.getSenha())].remove(usuario);
        }
    }

    private int hashMethod(int senha) {
        return (senha % tamanho);
    }
}
