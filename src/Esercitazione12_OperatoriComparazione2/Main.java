package Esercitazione12_OperatoriComparazione2;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contiene un metodo che che confronti due caratteri e determini
           se sono diversi. Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza. */

        char x = 'a';
        char y = 'A';
        System.out.println("Il primo carattere è: " + x);
        System.out.println("Il secondo carattere è: " + y);
        System.out.println("I caratteri sono uguali? " + areCharEquals(x, y));

    }

    public static boolean areCharEquals(char a, char b) {
        return a == b;
    }
}
