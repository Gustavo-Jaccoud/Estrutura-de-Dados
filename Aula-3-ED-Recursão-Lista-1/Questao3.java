public class Questao3 {
    public static void stringReverse(String palavra, int index) {
        char[] array = palavra.toCharArray();
        if (index >= array.length) {
            return;
        }

        System.out.print(array[array.length - 1 -index] + " ");


        stringReverse(palavra, index + 1);
    }

    public static void main(String[] args) {

        stringReverse("Palavra", 0);
    }
}
