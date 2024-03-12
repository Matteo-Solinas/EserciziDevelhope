package esercizio02_ExceptionsAndErrors02;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.

    public static void main(String[] args) {

        try {
            boolean result = checkIfCharIsNumber('c');
            System.out.println(result);
        } catch (Exception notANumber) {
            System.out.println(notANumber);
        }
    }

    public static boolean checkIfCharIsNumber(char character) throws Exception {
        if (Character.isDigit(character)) {
            return true;
        } else {
            throw new Exception("il carattere '" + character + "' non è un numero");
        }
    }
}
