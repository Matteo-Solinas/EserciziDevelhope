package esercizio03_ExceptionsAndErrors03;

public class Main {
    /*Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.*/
    public static void main(String[] args) {

        System.out.println(checkDivisionbyZero(5));
    }

    public static int checkDivisionbyZero(int inputNum) {
        try {
            return inputNum / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;
    }
}
