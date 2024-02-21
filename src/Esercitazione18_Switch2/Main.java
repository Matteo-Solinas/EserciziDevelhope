package Esercitazione18_Switch2;

public class Main {

    public static void main(String[] args) {

        /* Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica
           il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
           Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore. */

        System.out.println(checkMathOperation('+'));
        System.out.println(checkMathOperation('-'));
        System.out.println(checkMathOperation('*'));
        System.out.println(checkMathOperation('/'));
        System.out.println(checkMathOperation('a'));

    }

    //takes operator symbol as a character and return operation name;
    public static String checkMathOperation(char operator) {
        String result;

        switch (operator) {
            case '+':
                result = "Addition";
                break;
            case '-':
                result = "Subtraction";
                break;
            case '*':
                result = "Multiplication";
                break;
            case '/':
                result = "Division";
                break;
            default:
                result = "Error: operator not valid!";
                break;
        }
        return result;
    }
}
