public class Questao4 {
    public static int Tribonnacci(int n){
       if (n <=1){
            return 0;
        } else if (n==2) {
           return 1;
       }

        return Tribonnacci(n-1) + Tribonnacci(n-2) + Tribonnacci(n-3);
    }

    public static void main(String[] args) {
        System.out.println(Tribonnacci(4));
    }
}
