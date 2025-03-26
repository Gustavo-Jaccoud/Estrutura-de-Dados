package Nivelamento1;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Gustavo", "Ferreira", 895);
        Empregado empregado2 = new Empregado("Camila", "Santos", 1500);

        System.out.println("Salario anual dos empregados");
        System.out.println(empregado1.getNome() + " - Salario anual: R$ " + empregado1.getSalarioMensal()*12);
        System.out.println(empregado2.getNome() + " - Salario anual: R$ " + empregado2.getSalarioMensal()*12);

        empregado1.setSalarioMensal(empregado1.getSalarioMensal()*1.1);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal()*1.1);

        System.out.println("Salario anual dos empregados depois do aumento de 10%");

        System.out.println(empregado1.getNome() + " - Salario anual: R$ " + empregado1.getSalarioMensal()*12);
        System.out.println(empregado2.getNome() + " - Salario anual: R$ " + empregado2.getSalarioMensal()*12);



    }



}
