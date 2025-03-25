package Nivelamento1;

public class Fatura {
    String numero,descricao;
    int qtdItem;
    double precoItem;

    public Fatura(String numero, String descricao, int qtdItem, double precoItem){
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
    }

    public String getNumero() {return numero;}
    public String getDescricao(){return descricao;}
    public int getQtdItem() {return qtdItem;}
    public double getPrecoItem() {return precoItem;}

    public void setPrecoItem(double precoItem) {this.precoItem = precoItem;}
    public void setNumero(String numero) {this.numero = numero;}
    public void setQtdItem(int qtdItem) {this.qtdItem = qtdItem;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getTotalFatura(){
        if (qtdItem < 0){
            qtdItem = 0;
        }
        if (precoItem < 0){
            precoItem = 0;
        }
        double fatura = qtdItem * precoItem;
        return "Fatura: " + descricao + " | " + qtdItem + " X " + precoItem + " = " + fatura;
    }
}
