public class Questao1 {

    public static int somaArray(int n){

        if (n == 0){
            return 0;
        }
        return n + somaArray(n-1);

    }

    public static void main(String[] args) {
        System.out.println( somaArray(5));
    }
}
