package Nivelamento1;

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet(){
        conjunto = new boolean[101];
    }

    public void insereElemento(int k){
        this.conjunto[k] = true;
    }

    public void deleteElemento(int m){
        this.conjunto[m] = false;
    }

    public InteiroSet union(InteiroSet outro) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] || outro.conjunto[i]) {
                resultado.insereElemento(i);
            }
        }
        return resultado;
    }

    public InteiroSet intersecao(InteiroSet outro) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] && outro.conjunto[i]) {
                resultado.insereElemento(i);
            }
        }
        return resultado;
    }

    public String toSetString() {
        String resultado = "";

        for (int i = 0; i < 101; i++) {
            if (conjunto[i]) {
                resultado = resultado + i + " ";
            }
        }
        if (resultado == "") {
            return "-";
        }
        return resultado;
    }

    public boolean ehIgualTo(InteiroSet outro) {
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] != outro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

}
