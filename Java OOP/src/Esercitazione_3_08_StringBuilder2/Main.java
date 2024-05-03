package Esercitazione_3_08_StringBuilder2;

public class Main {
    /*Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico all'interno
      di una stringa e lo stampi. Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il
      carattere in unicode o una stringa di errore. Per la creazione della stringa di risultato dovrebbe essere utilizzato
      StringBuilder. */
    public static void main(String[] args) {

        String string1 = "abcdefghijklmnopqrstuvwxyz";
        String string2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String string3 = "Sono una stringa di test con molta fantasia";

        System.out.println(getUnicodeValueForChar(string1, 10));
        System.out.println(getUnicodeValueForChar(string2, 10));
        System.out.println(getUnicodeValueForChar(string3, string3.length() - 1));
        System.out.println(getUnicodeValueForChar(string1, 55));
        System.out.println(getUnicodeValueForChar(string3, 14));
        System.out.println(getUnicodeValueForChar(string3, 16));

    }

    public static StringBuilder getUnicodeValueForChar(String str, int indx) {
        StringBuilder risultato = new StringBuilder();

        if (indx >= 0 && indx < str.length()) {
            char character = str.charAt(indx);
            risultato.append("Nella stringa '").append(str).append("' il valore Unicode del carattere: '").append(str.charAt(indx))
                    .append("' all'indice: '").append(indx).append("' equivalale a: ").append((int) character);
        } else {
            risultato.append("ERRORE! L'indice selezionato è fuori limite rispetto alla lunghezza della stringa");
        }

        return risultato;
    }
}
