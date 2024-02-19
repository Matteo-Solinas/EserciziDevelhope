package Esercitazione07_operatoriAritmetici1;

public class Main {

    public static void main(String[] args) {

        /* Definisci un metodo per la divisione di 2 numeri interi che restituisca il resto che dovrà essere stampato. */

        System.out.println("Resto della divisione: " + resto(10, 3));

    }

    public static double resto(int a, int b) {
        return a % b;
    }
}
