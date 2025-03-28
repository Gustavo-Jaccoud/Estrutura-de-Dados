public class Questao2 {

    public static double somaArray(int n){

        if (n == 1){
            return 1;
        }
        return (double) 1/n + somaArray(n-1);

    }

    public static void main(String[] args) {
        System.out.println( somaArray(8));
    }
}
