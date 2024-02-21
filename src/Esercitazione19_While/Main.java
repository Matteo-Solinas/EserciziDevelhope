package Esercitazione19_While;

public class Main {

    public static void main(String[] args) {

        System.out.println("La somma equivale a: " + sumAllValues(5));
    }


    //Sum all values until it reaches the upper limit;
    public static int sumAllValues (int upperLimit) {

        int value = 0;
        int sum = 0;

        while (value < upperLimit) {
            sum += value;
            value++;
        }
        return sum;
    }
}
