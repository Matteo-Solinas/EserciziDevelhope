package esercizio23_Testing03;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    /* Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z;
       Formatta la data ottenendo 01 marzo 2023;
       Stampa sulla console;
       Fai attenzione a usare almeno Java 8;
       Crea dei test per questo esercizio; */

    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        String testEmptyString = "";

        OffsetDateTime date = parseOffsetDateTime(dateString);
        String dateStringLong = formatLong(date);

        System.out.println("Formata data Long: " + dateStringLong);

        System.out.println();
        System.out.println("Test empty String");
        try {
            OffsetDateTime testDate = parseOffsetDateTime(testEmptyString);
            System.out.println(testDate);
        } catch (DateTimeException e) {
            System.out.println(e);
        }
    }

    static String formatLong(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    static OffsetDateTime parseOffsetDateTime(String dateString) {
        if (dateString.isEmpty()) {
            throw new DateTimeException("The string is empty and cannot be parsed");
        } else {
            return OffsetDateTime.parse(dateString);
        }
    }

}
