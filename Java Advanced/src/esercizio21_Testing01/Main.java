package esercizio21_Testing01;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    /* -Riprendi uno degli esercizi già svolti e corretti:
         -Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
         -Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z;
         -Verificare che la prima data è precedente alla seconda;
         -Verificare che la seconda data è successiva alla prima;
         -Verificare che le due date sono uguali;
         -Stampa il risultato;
       -Aggiungi Junit al progetto;
       -Crea una funzione di test che non dia errori. */

    public static void main(String[] args) {

        String date1 = "2023-03-01T13:00:00Z";
        String date2 = "2024-03-01T13:00:00Z";

        OffsetDateTime dateParse1 = offsetDateTimeParse(date1);
        OffsetDateTime dateParse2 = offsetDateTimeParse(date2);

        System.out.println("dateParse1 è precedente a dateParse2? " + dateParse1.isBefore(dateParse2));
        System.out.println("dateParse2 è successiva a dateParse1? " + dateParse2.isAfter(dateParse1));
        System.out.println("dateParse1 è uguale a dateParse2? " + dateParse1.isEqual(dateParse2));

    }

    private static OffsetDateTime offsetDateTimeParse(String dateString) {
        return OffsetDateTime.parse(dateString);
    }


}
