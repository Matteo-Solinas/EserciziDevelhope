package esercizio05_Nullability;

public class Main {

    /*Scrivere una funzione che accetti in input un numeratore e un denominatore. Controlli che il numeratore
     e il denominatore non siano null. Usare la funzione appena scritta in due blocchi di codice dove
      si cattura l'eventuale eccezione.*/

    public static void main(String[] args) {

        Double numerator = 2.3;
        Double denominator = 3.4;
        Double numeratorNull = null;
        Double denominatorNull = null;

        System.out.println("Risultato frazione senza argomenti null");
        System.out.println("il risultato è: " + checkFractionNullabilityException(numerator, denominator));

        System.out.println("Risultato frazione con il numeratore null");
        System.out.println(checkFractionNullabilityException(numeratorNull, denominator));

        System.out.println("Risultato frazione con il denominatore null");
        System.out.println(checkFractionNullabilityException(numerator, denominatorNull));

    }

    public static double fraction(Double numerator, Double denominator) {

        if (numerator == null) {
            throw new NullPointerException("Il numeratore è Null!");
        }
        if (denominator == null) {
            throw new NullPointerException("Il denominatore è Null!");
        }

        return numerator / denominator;
    }

    public static double checkFractionNullabilityException(Double numerator, Double denominator) {

        try {
            return fraction(numerator, denominator);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        return 0.0;
    }
}
