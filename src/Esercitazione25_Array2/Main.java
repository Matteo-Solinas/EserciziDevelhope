package Esercitazione25_Array2;

public class Main {

    /* Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
     * Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.*/

    public static void main(String[] args) {

        char[] chars = createArrayChar();
        char toCheck = 'a';
        System.out.println("numero delle occorrenze per il carattere '" + toCheck + "': " + checkCharOccurrences(toCheck,chars));
    }

    //creates an array of chars with index 0 to 4
    public static char[] createArrayChar() {
        char[] chars = new char[5];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';

        return chars;
    }

    //calculates occurrences of a specific character inside an array
    public static int checkCharOccurrences(char toCheck, char[] chars) {
        int occurrences = 0;

        for (char char1 : chars) {
            if (char1 == toCheck) {
                occurrences++;
            }
        }
        return occurrences;
    }
}