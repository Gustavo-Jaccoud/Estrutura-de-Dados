package Dados.Estrutura;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String nome, sobrenome;
    private byte dia, mes;
    private short ano;

    HeartRates(String nome, String sobrenome, byte dia, byte mes, short ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome(){return this.nome;}
    public String getSobrenome(){return this.sobrenome;}
    public byte getDia(){return this.dia;}
    public byte getMes(){return this.mes;}
    public short getAno(){return this.ano;}

    public void setNome(String nome){this.nome = nome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome;}
    public void setDia(byte dia){this.dia = dia;}
    public void setMes(byte mes){this.mes = mes;}
    public void setAno(short ano){this.ano = ano;}


    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome + " : " + this.dia + "/" + this.mes + "/" + this.ano;
    }

    public short calcIdade(){
        LocalDate dataAtual = LocalDate.now();
        byte diaAtual = (byte) dataAtual.getDayOfMonth();
        byte mesAtual = (byte) dataAtual.getMonthValue();
        short anoAtual =( short) dataAtual.getYear();

        short idade = (short) (anoAtual - this.ano);

        if (mesAtual < mes || (mesAtual == mes && diaAtual < dia)) {
            idade--;
        }

        return idade;
    }

    public  short maxHeartRate(){
        return (short) (220 - calcIdade());
    }

    public String targetHeartRate(){

        short maxHeartRate = maxHeartRate();
        return "Frequência Cardíaca Alvo: " + maxHeartRate * 0.5 + " a " + maxHeartRate * 0.85 + " bpm";
    }

}
