package esercizio26_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    /* Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
       (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum.
       Crea un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
       Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo. */

    public static void main(String[] args) {

        BigDecimal big1 = BigDecimal.valueOf(156.397);
        BigDecimal big2 = BigDecimal.valueOf(365.905);

        Operations opInput = operationInput();

        System.out.println("Il risultato dell'operazione '" + opInput.toString().toLowerCase() + "' tra " + big1 + " e " + big2
                + " è = " + selectOperation(big1, big2, opInput));


    }

    //prende input per selezionare l'operazione
    public static Operations operationInput() {
        Scanner scnr = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    select an operation:
                        ADD,
                        SUBTRACT,
                        MULTIPLY,
                        DIVIDE,
                        MIN,
                        MAX\s""");
            try {
                String opInput = scnr.next();
                return Operations.valueOf(opInput.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid Operation, try again please");
            }
        }
    }

    //esegue operazione selezionata
    public static BigDecimal selectOperation(BigDecimal big1, BigDecimal big2, Operations opIpnut) {
        return switch (opIpnut) {
            case ADD -> addition(big1, big2);
            case SUBTRACT -> subtraction(big1, big2);
            case MULTIPLY -> multiplication(big1, big2);
            case DIVIDE -> division(big1, big2);
            case MAX -> maximum(big1, big2);
            case MIN -> minimum(big1, big2);
        };
    }

    public static BigDecimal addition(BigDecimal big1, BigDecimal big2) {
        return big1.add(big2);
    }

    public static BigDecimal subtraction(BigDecimal big1, BigDecimal big2) {
        return big1.subtract(big2);
    }

    public static BigDecimal multiplication(BigDecimal big1, BigDecimal big2) {
        return big1.multiply(big2);
    }

    public static BigDecimal division(BigDecimal big1, BigDecimal big2) {
        return big1.divide(big2, RoundingMode.CEILING);
    }

    public static BigDecimal maximum(BigDecimal big1, BigDecimal big2) {
        return big1.max(big2);
    }

    public static BigDecimal minimum(BigDecimal big1, BigDecimal big2) {
        return big1.min(big2);
    }

}
