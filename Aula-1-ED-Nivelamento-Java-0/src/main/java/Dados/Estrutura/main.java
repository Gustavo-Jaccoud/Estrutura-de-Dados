package Dados.Estrutura;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        HeartRates pessoa = new HeartRates("Gustavo","Jaccoud", (byte)19,(byte)11,(short)2003);

        System.out.println(pessoa);

        System.out.println(pessoa.calcIdade() + " Anos");

        System.out.println("A frequência Cardíaca máxima :" + pessoa.maxHeartRate() + " bpm");

        System.out.println(pessoa.targetHeartRate());
    }
}
