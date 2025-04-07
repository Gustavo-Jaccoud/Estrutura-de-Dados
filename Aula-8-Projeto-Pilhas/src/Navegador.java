class Navegador {
    private Pilha historico = new Pilha<Pagina>();

    private Pilha historicoBackup = new Pilha<Pagina>();

    public void visitarPagina(String url) {
        Pagina pagina = new Pagina(url);
        historico.adiciona(pagina);
        System.out.println("Url adicionada: " + url);
    }

    public Pagina voltar() {

        if (historico.topo() != null) {
            historicoBackup.adiciona(historico.topo());
            historico.remove();
            if (historico.topo() != null) {
                return (Pagina) historico.topo();
            }
        }
        System.out.println("Não há páginas anteriores.");
        return null;

    }

    public Pagina avancar() {
        if (historicoBackup.topo() != null) {
            historico.adiciona(historicoBackup.topo());
            historicoBackup.remove();
            return (Pagina) historico.topo();
        }
        System.out.println("Não há páginas futuras para avançar.");
        return null;
    }

    public void exibirHistorico() {

        Pilha<Pagina> historicoBackup2 = new Pilha<>();
        int countBackup = 0;
        int verficador = 0;
        if (historico.topo() != null) {
            System.out.println("|-H " + historico.topo() + "<- [Atual]");
            verficador = 1;

        } else if (historicoBackup.topo() != null) {
            System.out.println("|- " + historicoBackup.topo() + "<- [Atual]");
            verficador = 2;
        }
        while (historicoBackup.topo() != null) {
            if (verficador == 2) {
                historicoBackup2.adiciona((Pagina) historicoBackup.topo());
                historicoBackup.remove();
                verficador = 5;

            }
            Pagina topo = (Pagina) historicoBackup.topo();
            System.out.println("|- " + topo);
            historicoBackup2.adiciona(topo);
            historicoBackup.remove();
            countBackup++;
        }

        while (historico.topo() != null) {
            if (verficador == 1) {
                historicoBackup2.adiciona((Pagina) historico.topo());
                historico.remove();
                verficador = 5;
                continue;
            }
            Pagina topo = (Pagina) historico.topo();
            System.out.println("|- " + topo);
            historicoBackup2.adiciona(topo);
            historico.remove();
        }

        // Restaura pilhas
        while (historicoBackup2.topo() != null) {
            historico.adiciona(historicoBackup2.topo());
            historicoBackup2.remove();
        }

        // Volta ao estado anterior
        for (int i = 0; i < countBackup; i++) {
            voltar();
        }
    }

}