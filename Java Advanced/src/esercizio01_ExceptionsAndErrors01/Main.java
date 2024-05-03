package esercizio01_ExceptionsAndErrors01;

public class Main {

    /*Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ;
      se non lo è, lancia un'eccezione.*/

    public static void main(String[] args) {

        int minRangeBound = 10;
        int maxRangeBound = 20;
        int inputValue = 1;

        try {
            boolean result = isInRange(inputValue, minRangeBound, maxRangeBound);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static boolean isInRange(int inputValue, int minRangeBound, int maxRangeBound) throws Exception {

        if (inputValue >= minRangeBound && inputValue <= maxRangeBound) {
            return true;
        } else {
            throw new Exception("Il valore " + inputValue + " non è compreso tra " + minRangeBound + " e " + maxRangeBound);
        }

    }
}
