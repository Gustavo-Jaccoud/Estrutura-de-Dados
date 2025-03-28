public class Questao4 {


        public static int recursiveMinimum(int[] arr, int index) {

            if (index == arr.length - 1) {
                return arr[index];
            }

            int minRestante = recursiveMinimum(arr, index + 1);


            if (arr[index] < minRestante) {
                return arr[index];
            } else {
                return minRestante;
            }
        }

        public static void main(String[] args) {
            int[] array = {4,3,2,1,0};

            int menorElemento = recursiveMinimum(array, 0);

            System.out.println("O menor elemento do array é: " + menorElemento);
        }
    }

