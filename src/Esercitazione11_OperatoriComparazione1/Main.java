package Esercitazione11_OperatoriComparazione1;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini
           se sono diversi. Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza */

        int x = 5;
        int y = -5;
        System.out.println("Il primo numero è: " + x);
        System.out.println("Il secondo numero è: " + y);
        System.out.println("I due numeri sono uguali? " + areNumberEquals(x, y));

    }

    public static boolean areNumberEquals(int a, int b) {
        return a == b;
    }
}
