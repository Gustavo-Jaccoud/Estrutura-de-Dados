import java.util.Arrays;
import java.util.List;

public class Questao2 {

    public static void printArray(int[] array, int index) {
        if (index >= array.length) {
            return;
        }

        System.out.print(array[index] + " ");

        printArray(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        printArray(array, 0);
    }

}
