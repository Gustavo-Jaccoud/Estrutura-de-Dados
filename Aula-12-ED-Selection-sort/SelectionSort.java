import java.util.List;

public class SelectionSort {
    public static List<Aluno> selectionSort(List<Aluno> alunos) {
        for (int i = 0; i < alunos.size() - 1; i++) {
            for (int j = i; j < alunos.size(); j++) {
                if (alunos.get(i).getMatricula() > alunos.get(j).getMatricula()) {
                    Aluno aux = alunos.get(i);
                    alunos.set(i, alunos.get(j));
                    alunos.set(j, aux);
                }
            }
        }
        return alunos;
    }
}