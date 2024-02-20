package Esercitazione13_OperatoriLogici1;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore
           di confronto verifichi se il numero di confronto è compreso tra due valori specifici
           e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore) */

        int limiteInferiore = 1;
        int limiteSuperiore = 10;
        int valore = 11;

        System.out.println("Il valore è compreso? " + isContained(limiteInferiore, limiteSuperiore, valore));

    }

    public static boolean isContained(int limiteInferiore, int limiteSuperiore, int val) {
        return (val >= limiteInferiore) && (val <= limiteSuperiore);
    }

}
