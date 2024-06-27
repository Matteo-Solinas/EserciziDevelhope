package Esercitazione14_OperatoriLogici2;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca
           se un numero è pari o dispari utilizzando solo gli operatori logici. */

        int number = 6;
        System.out.println("Il numero " + number + " è dispari? " + checkOdd(number));

    }

    public static boolean checkOdd(int num) {
        boolean isEven = num % 2 == 0;
        return !isEven;
    }

}
