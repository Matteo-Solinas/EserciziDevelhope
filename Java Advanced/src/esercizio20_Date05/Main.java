package esercizio20_Date05;

import java.time.OffsetDateTime;

public class Main {

    /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
       Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z;
       Verificare che la prima data è precedente alla seconda;
       Verificare che la seconda data è successiva alla prima;
       Verificare che le due date sono uguali;
       Stampa il risultato; */

    public static void main(String[] args) {

        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("date1 è precedente a date2? " + date1.isBefore(date2));
        System.out.println("date2 è successiva a date1? " + date2.isAfter(date1));
        System.out.println("date1 è uguale a date2? " + date1.isEqual(date2));
    }
}
