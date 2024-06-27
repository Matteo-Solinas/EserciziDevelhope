package Esercitazione04_Casting2;

public class Main {

    public static void main(String[] args) {

        /* Dati due caratteri, restituire la somma dei loro valori ASCII */

        char a = 'a';
        char b = 'b';

        /* In Java, quando si sommano due variabili di tipo char,
        il risultato è la somma dei loro valori ASCII */
        int combined = a + b;

        System.out.println("valore ASCII di a + b = " + combined);
    }
}
