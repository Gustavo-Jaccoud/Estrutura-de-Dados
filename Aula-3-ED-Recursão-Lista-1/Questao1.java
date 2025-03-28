public class Questao1 {

    public static boolean testePalindromo(String palavra) {
        String[] palavraArray = palavra.split("");

        char primeiro = palavraArray[0].charAt(0);
        char ultimo = palavraArray[palavraArray.length - 1].charAt(0);

        System.out.println(primeiro + " - " + ultimo);

        if (!Character.isLetter(primeiro)) {
            palavraArray[0] = "";
            return testePalindromo(String.join("",palavraArray));
        }
        if (!Character.isLetter(ultimo)) {
            palavraArray[palavraArray.length - 1] = "";
            return testePalindromo(String.join("",palavraArray));
        }
        if (palavraArray.length == 1){
            return true;
        } else if (primeiro == ultimo) {
            palavraArray[0] = "";
            palavraArray[palavraArray.length - 1] = "";
            return testePalindromo(String.join("",palavraArray));
        }

            return false;

    }


    public static void main(String[] args) {

        System.out.println(testePalindromo("a bola da loba"));
    }
}
