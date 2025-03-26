package Nivelamento1;

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet(){
        conjunto = new boolean[101];
    }

    public void insereElemento(int k){
        this.conjunto[k] = true;
    }

    public void deletaElemento(int m){
        this.conjunto[m] = true;
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
        StringBuilder sb = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i < 101; i++) {
            if (conjunto[i]) {
                if (!vazio) {
                    sb.append(" ");
                }
                sb.append(i);
                vazio = false;
            }
        }
        if (vazio) {
            return "-";
        }
        return sb.toString();
    }
    public boolean ehIgualTo(InteiroSet outro) {
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] != outro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        InteiroSet set1 = new InteiroSet();
        InteiroSet set2 = new InteiroSet();

        set1.insereElemento(1);
        set1.insereElemento(3);
        set1.insereElemento(5);

        set2.insereElemento(3);
        set2.insereElemento(4);
        set2.insereElemento(5);

        System.out.println("Set 1: " + set1.toSetString());
        System.out.println("Set 2: " + set2.toSetString());

        InteiroSet unionSet = set1.union(set2);
        System.out.println("União de Set 1 e Set 2: " + unionSet.toSetString());

        InteiroSet intersectionSet = set1.intersecao(set2);
        System.out.println("Interseção de Set 1 e Set 2: " + intersectionSet.toSetString());

        System.out.println("Set 1 é igual ao Set 2? " + set1.ehIgualTo(set2));
    }


}
