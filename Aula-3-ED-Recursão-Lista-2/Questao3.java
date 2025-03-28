public class Questao3 {
    public static int exp(int x, int k){

        if (k == 0){
            return 1;
        }
        return x * exp(x, k-1);

    }

    public static void main(String[] args) {
        System.out.println( exp(5,3));
    }
}
