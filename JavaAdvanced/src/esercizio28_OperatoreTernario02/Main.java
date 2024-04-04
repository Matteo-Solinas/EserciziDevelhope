package esercizio28_OperatoreTernario02;

public class Main {

    /* Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario

    public class Module01 {
        public static void main(String[] args) {
            System.out.println(checkString("Questa è una stringa"));
        }

        private static String checkString(String value) {
            String result;
            if (value.length() >= 10) {
                result = "Lunghezza maggiore o uguale di 10";
            } else {
                result = "Lunghezza minore di 10";
            }
            return result;
        }
    } */

    public static void main(String[] args) {
        System.out.println(checkStringTernaryOperator("Questa è una stringa"));
    }

    //metodo con operatore ternario
    private static String checkStringTernaryOperator(String value) {
        String result;

        result = value.length() >= 10
                ? "Lunghezza maggiore o uguale di 10"
                : "Lunghezza minore di 10";

        return result;
    }

}

