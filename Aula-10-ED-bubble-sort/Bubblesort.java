import java.util.ArrayList;

public class Bubblesort {
    public static ArrayList<String[]> bubblesort(ArrayList<String[]> array) {
        long contatador = 0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size(); j++) {
                double valorAnterior = Double.parseDouble(array.get(j - 1)[2]);
                double valorAtual = Double.parseDouble(array.get(j)[2]);

                if (valorAnterior < valorAtual) {
                    String[] tmp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, tmp);
                }
                System.out.println("-> " + contatador);
                contatador++;
            }
        }
        System.out.println("total de vezes: " + contatador);
        return array;
    }

}
