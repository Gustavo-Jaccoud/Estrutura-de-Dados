public class Registro {

    private String dataHora;
    private String piloto;
    private String equipe;
    private String tempo;
    private int tempoMilissegundos;

    public Registro(String dataHora, String piloto, String equipe, String tempo) {
        this.dataHora = dataHora;
        this.piloto = piloto;
        this.equipe = equipe;
        this.tempo = tempo;

        String[] partesTempo = tempo.split(":");
        this.tempoMilissegundos = Integer.parseInt(partesTempo[0]) * 60000 +
                Integer.parseInt(partesTempo[1]) * 1000 +
                Integer.parseInt(partesTempo[2]);
    }

    public String getPiloto() {
        return piloto;
    }

    public int getTempoMilissegundos() {
        return tempoMilissegundos;
    }

    @Override
    public String toString() {
        return dataHora + " - " + piloto + " - " + equipe + " - " + tempo;
    }

}
