package Nivelamento1;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("999", "mouse", 4,40.3);
        System.out.println("Fatura: " +
                fatura.getDescricao() +
                " | " +
                fatura.getQtdItem() +
                " X " +
                fatura.getPrecoItem() +
                " = " +
                fatura.getTotalFatura());

    }
}
