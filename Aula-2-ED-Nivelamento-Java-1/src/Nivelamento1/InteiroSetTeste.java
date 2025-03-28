package Nivelamento1;

public class InteiroSetTeste {
    public static void main(String[] args) {
        InteiroSet set1 = new InteiroSet();
        InteiroSet set2 = new InteiroSet();

        set1.insereElemento(1);
        set1.insereElemento(3);
        set1.insereElemento(5);

        set2.insereElemento(3);
        set2.insereElemento(2);
        set2.insereElemento(5);

        System.out.println("Set 1: " + set1.toSetString());
        System.out.println("Set 2: " + set2.toSetString());

        InteiroSet unionSet = set1.union(set2);
        System.out.println("União de Set 1 e Set 2: " + unionSet.toSetString());

        InteiroSet intersectionSet = set1.intersecao(set2);
        System.out.println("Interseção de Set 1 e Set 2: " + intersectionSet.toSetString());

        System.out.println("Set 1 é igual ao Set 2? " + set1.ehIgualTo(set2));

        set2.deleteElemento(2);
        set2.insereElemento(1);

        System.out.println("Set 1: " + set1.toSetString());
        System.out.println("Set 2: " + set2.toSetString());

        System.out.println("Set 1 é igual ao Set 2? " + set1.ehIgualTo(set2));

    }
}
