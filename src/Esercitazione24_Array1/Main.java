package Esercitazione24_Array1;

public class Main {

    /* Scrivi un programma che contenga un metodo che crea un array e lo riempie
     * con i numeri da 1 a 10 e che che calcoli la somma dei numeri contenuti nell'array
     * inizializzato e la stampi a video.*/


    public static void main(String[] args) {

        int[] numbers1To10 = createArray();
        System.out.println("sum of all numbers: " + sumArrayNumbers(numbers1To10));

    }

    //creates an array with numbers from 1 to 10
    public static int[] createArray() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println("[" + i + "]:" + " " + numbers[i]);
        }
        return numbers;
    }

    // sum all the numbers in the array
    public static int sumArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
