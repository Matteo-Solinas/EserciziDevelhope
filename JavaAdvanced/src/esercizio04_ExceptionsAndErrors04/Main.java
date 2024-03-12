package esercizio04_ExceptionsAndErrors04;

public class Main {

    /*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestisca
     sia l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
      Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

    public static void main(String[] args) throws Exception {

        int[] numbers = new int[]{43, 25, 23, 12, 13};

        System.out.println(checkArrayDivisionErrors(numbers, 4));
        System.out.println(checkArrayDivisionErrors(numbers, 6));

    }

    public static int checkArrayDivisionErrors(int[] array, int index) {

        try {
            return array[index] / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        return 0;
    }
}
