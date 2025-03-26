package Nivelamento1;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data(19,11,2003);

        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());
        System.out.println(data.displayData());

        data.setDia(25);
        data.setMes(03);
        data.setAno(2025);

        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());
        System.out.println(data.displayData());



    }
}
