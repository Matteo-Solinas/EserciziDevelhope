package esercizio03_ExceptionsAndErrors03;

public class Main {

    /*Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.*/

    public static void main(String[] args) {

        System.out.println(checkDivisionByZero(5));
    }

    public static boolean checkDivisionByZero(int inputNum) {
        try {
            int result = inputNum / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is impossible: " + e.getMessage());
        }
        return false;
    }
}
