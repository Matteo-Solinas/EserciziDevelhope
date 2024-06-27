package Esercitazione16_If_Else_Elseif2;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza
           stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10". */

        String string1 = "stringa";
        String string2 = "stringa lunga";
        String string3 = "ciao!ciao!";

        checkStringLength(string1);
        checkStringLength(string2);
        checkStringLength(string3);

    }

    //it checks a string length;
    public static void checkStringLength(String string) {

        if (string.length() > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (string.length() < 10) {
            System.out.println("Lunghezza minore di 10");
        } else {
            System.out.println("Lunghezza pari a 10");
        }
    }

}
