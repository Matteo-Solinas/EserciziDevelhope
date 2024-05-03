package esercizio25_Testing05;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
       Aggiungi un anno, sottrai un mese, aggiungi 7 giorni;
       Stampa il risultato localizzata per l'Italia;
       Crea dei test per questo esercizio; */

    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        String testEmptyString = "";
        OffsetDateTime startingDateString = parseOffsetDateTime(dateString);
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

        try {
            OffsetDateTime testDate = parseOffsetDateTime(testEmptyString);
            System.out.println(testDate);
        } catch (DateTimeException e) {
            System.out.println(e);
        }

    }

    static OffsetDateTime setDate(OffsetDateTime date) {
        //aggiunge un anno
        date = date.plusYears(1);

        //sottrae un mese
        date = date.minusMonths(1);

        //aggiunge una settimana
        date = date.plusWeeks(1);

        return date;
    }

    static OffsetDateTime parseOffsetDateTime(String dateString) {
        if (dateString.isEmpty()) {
            throw new DateTimeException("The string is empty and cannot be parsed");
        } else {
            return OffsetDateTime.parse(dateString);
        }
    }
}
