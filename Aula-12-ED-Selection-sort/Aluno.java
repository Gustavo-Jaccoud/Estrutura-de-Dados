public class Aluno {
    private long matricula;
    private String dataDeMatricula, nome, dataDeAniversario, curso;

    public Aluno(String matricula, String dataDeMatricula, String nome, String dataDeAniversario, String curso) {
        this.matricula = Long.parseLong(matricula);
        this.dataDeMatricula = dataDeMatricula;
        this.nome = nome;
        this.dataDeAniversario = dataDeAniversario;
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return matricula + " | " + dataDeMatricula + " | " + nome + " | " + dataDeAniversario + " | " + curso;
    }
}
