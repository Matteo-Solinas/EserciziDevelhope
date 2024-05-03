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

        OffsetDateTime startingDateString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter startingDateStringFormat = DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));
        String startingDateStringLocalizedIta = startingDateString.format(startingDateStringFormat);
        System.out.println("startingDate: " + startingDateStringLocalizedIta);

        //aggiunge un anno
        startingDateString = startingDateString.plusYears(1);
        DateTimeFormatter dateFormatPlus1Year = DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));
        String dateLocalizedItaPlus1Year = startingDateString.format(dateFormatPlus1Year);
        System.out.println("datePlus1Year: " + dateLocalizedItaPlus1Year);

        //sottrae un mese
        startingDateString = startingDateString.minusMonths(1);
        DateTimeFormatter dateFormatMinus1Month = DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));
        String dateLocalizedItaMinus1Month = startingDateString.format(dateFormatMinus1Month);
        System.out.println("dateMinus1Month: " + dateLocalizedItaMinus1Month);

        //aggiunge una settimana
        startingDateString = startingDateString.plusWeeks(1);
        DateTimeFormatter dateFormatPlus1Week = DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));
        String dateLocalizedIta1Week = startingDateString.format(dateFormatPlus1Week);
        System.out.println("datePlus7Days: " + dateLocalizedIta1Week);

        //data aggiornata
        DateTimeFormatter dateStringFormat = DateTimeFormatter.ofPattern("dd/MMMM/yyyy").withLocale(Locale.ITALY)
                .withZone(ZoneId.of("Europe/Rome"));
        String dateStringLocalizedIta = startingDateString.format(dateStringFormat);
        System.out.println("Data aggiornata: " + dateStringLocalizedIta);

    }
}
