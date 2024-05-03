package Esercitazione03_Casting1;

public class Main {

    public static void main(String[] args) {

        /* Scrivere uno snippet di codice che dati 2 numeri
           con la virgola(double) li sommi e li stampi senza virgola (int). */

        double x = 2.0;
        double y = 3.0;

        int somma = (int) x + (int) y;

        System.out.println(somma);
    }
}
