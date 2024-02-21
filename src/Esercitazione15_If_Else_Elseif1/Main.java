package Esercitazione15_If_Else_Elseif1;

public class Main {

    public static void main(String[] args) {

        /* Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz"
           al posto del numero e per i multipli di 5 stampi "Buzz". Nel caso in cui un numero sia multiplo di
           entrambi stampi "FizzBuzz". */

        for (int i = 1; i <= 100; i++) {
            System.out.println("Number " + i + ": " + checkNumber(i));
        }
    }

    // check if a number is a multiple of 3 or a multiple of 5 or a multiple of both;
    public static String checkNumber(int number) {
        String result;

        if (number % 3 == 0 && number % 5 == 0) {
            result = "Fizz";
        } else if (number % 3 == 0) {
            result = "Buzz";
        } else if (number % 5 == 0) {
            result = "FizzBuzz";
        } else {
            result = "Is not a multiple of 3 or 5";
        }
        return result;
    }

}
