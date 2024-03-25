package esercizio19_Date04;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
       aggiungi un anno, sottrai un mese, aggiungi 7 giorni;
       Stampa il risultato localizzata per l'Italia; */

    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("date: " + date);

        //aggiunge un anno
        date = date.plusYears(1);
        System.out.println("datePlus1Year: " + date);

        //sottrae un mese
        date = date.minusMonths(1);
        System.out.println("dateMinus1Month: " + date);

        //aggiunge una settimana
        date = date.plusWeeks(1);
        System.out.println("datePlus7Days: " + date);

        //localizzazione formato e data italiana
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));

        String dateLocalizedIta = date.format(dateFormat);
        System.out.println("Data e ora localizzate per l'Italia: " + dateLocalizedIta);

    }
}
