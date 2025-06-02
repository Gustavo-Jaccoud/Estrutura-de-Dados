import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Pedido {

    private int id, quantidadeItens;
    private String nome, status, metodoPagamento, cidade, categoria;
    private LocalDateTime dataPedido;
    private LocalDate dataEntrega;
    private double valor;

    private static final DateTimeFormatter formatterDataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Pedido(String id, String dataPedido, String nome, String valor, String status, String quantidadeItens,
            String metodoPagamento, String dataEntrega, String cidade, String categoria) {

        this.id = Integer.parseInt(id);
        this.quantidadeItens = Integer.parseInt(quantidadeItens);
        this.nome = nome;
        this.status = status;
        this.metodoPagamento = metodoPagamento;
        this.cidade = cidade;
        this.categoria = categoria;

        this.dataPedido = LocalDateTime.parse(dataPedido, formatterDataHora);

        if (dataEntrega != null && !dataEntrega.isEmpty()) {
            this.dataEntrega = LocalDate.parse(dataEntrega, formatterData);
        }

        this.valor = Double.parseDouble(valor);
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public String getStatus() {
        return status;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public String getCidade() {
        return cidade;
    }

    public long getDataPedido() {
        return dataPedido.toEpochSecond(ZoneOffset.UTC);
    }

    public long getDataEntregada() {
        if (dataEntrega != null) {
            return dataEntrega.atStartOfDay().toEpochSecond(ZoneOffset.UTC);
        } else {
            return 0L;
        }
    }

    public Double getValor() {
        return valor;
    }

    public Object getValorPorChave(String chave) {
        switch (chave) {
            case "itens":
                return getQuantidadeItens();
            case "status":
                return getStatus();
            case "metodoPagamento":
                return getMetodoPagamento();
            case "cidade":
                return getCidade();
            case "dataPedido":
                return getDataPedido();
            case "dataEntrega":
                return getDataEntregada();
            case "valor":
                return getValor();
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return id + " | "
                + dataPedido.format(formatterDataHora) + " | "
                + nome + " | "
                + valor + " | "
                + status + " | "
                + quantidadeItens + " | "
                + metodoPagamento + " | "
                + (dataEntrega != null ? dataEntrega.format(formatterData) : "N/A") + " | "
                + cidade + " | "
                + categoria;
    }
}
