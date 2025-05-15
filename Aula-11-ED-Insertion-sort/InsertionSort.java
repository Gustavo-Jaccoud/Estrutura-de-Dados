import java.util.List;

public class InsertionSort {

    public static List<Registro> insertionSort(List<Registro> registros) {
        for (int i = 1; i < registros.size(); i++) {
            Registro tmp = registros.get(i);
            int j = i;

            while (j > 0 && (tmp.getTempoMilissegundos() < registros.get(j - 1).getTempoMilissegundos() ||
                    (tmp.getTempoMilissegundos() == registros.get(j - 1).getTempoMilissegundos()
                            && tmp.getPiloto().compareTo(registros.get(j - 1).getPiloto()) < 0))) {

                registros.set(j, registros.get(j - 1));
                j--;
            }

            registros.set(j, tmp);
        }
        return registros;
    }

}