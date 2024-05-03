package Esercitazione06_Funzioni2;

public class Main {

    public static void main(String[] args) {

        /* Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza */

        String stringInput = "ciao ciao ciao!";
        int length = stringLength(stringInput);
        System.out.println("La stringa: " + stringInput + " è lunga: " + length);

    }

    public static int stringLength(String string) {
        return string.length();
    }

}
