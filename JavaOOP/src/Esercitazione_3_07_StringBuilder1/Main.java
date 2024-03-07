package Esercitazione_3_07_StringBuilder1;

public class Main {
    /*Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
      Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi
      sul risultato del confronto. Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
      */
    public static void main(String[] args) {
        String test1 = "Tre tigri contro tre tigri";
        String test2 = "Sopra la panca la capra campa, sotto la panca la capra crepa";
        String test3 = "Tre tigri contro tre tigri";

        String result1 = areStringEquals(test1,test2);
        System.out.println(result1);

        String result2 = areStringEquals(test1,test3);
        System.out.println(result2);

    }
    public static String areStringEquals(String string1, String string2) {
        StringBuilder strbld = new StringBuilder().append("Le due stringhe sono ");
        if (string1.equals(string2)) {
            return strbld.append("uguali").toString();
        }
        return strbld.append("differenti").toString();
    }
}