public class Empresa {

    private String nomeFantasia, inscricaoEstadual;
    private Double valorDeMercado;

    Empresa(String nomeFantasia, String inscricaoEstadual, String valorDeMercado) {
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
        this.valorDeMercado = Double.parseDouble(valorDeMercado);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(Double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

}
