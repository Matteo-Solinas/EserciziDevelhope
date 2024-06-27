package Esercitazione10_OperatoriAssegnazione;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contiene un metodo che date due variabili le incrementi
         di un valore scelto da te e le moltiplichi fra di loro. Il metodo dovrà restituire
         il risultato dell'operazione che dovrà essere stampato a video. */

        System.out.println("Risultato: " + incrAndMulti(12.2, 2, 10.5, 3));

    }

    public static double incrAndMulti(double a, int incrementA, double b, int incrementB) {
        a += incrementA;
        b += incrementB;
        return a * b;
    }
}
