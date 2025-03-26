package Nivelamento1;

public class Fatura {
    private String numero,descricao;
    private int qtdItem;
    private double precoItem;

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

    public double getTotalFatura(){
        if (this.qtdItem < 0){
            this.qtdItem = 0;
        }
        if (this.precoItem < 0){
            this.precoItem = 0;
        }
        return this.qtdItem * this.precoItem;
    }
}
