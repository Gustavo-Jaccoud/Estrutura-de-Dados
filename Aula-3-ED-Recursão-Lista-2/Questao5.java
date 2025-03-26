public class Questao5 {
    public static int pell(int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }

        return pell(n-1)*2 + pell(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pell(5));
    }

}
