package esercizio22_Testing02;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Main {

    /* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z;
    Formatta la data ottenuta in FULL, MEDIUM e SHORT;
    Stampa le varie versioni -Crea dei test per questo esercizio; */

    public static void main(String[] args) {

        String dateString = "2002-03-01T13:00:00Z";
        String testEmptyString = "";
        OffsetDateTime date = parseOffsetDateTime(dateString);

        String dateStringShort = formatDateShort(date);
        String dateStringMedium = formatDateMedium(date);
        String dateStringFull = formatDateFull(date);

        System.out.println("Formato data Short: " + dateStringShort);
        System.out.println("Formato data Medium: " + dateStringMedium);
        System.out.println("Formato data Full: " + dateStringFull);

        try {
            OffsetDateTime testDate = parseOffsetDateTime(testEmptyString);
            System.out.println(testDate);
        } catch (DateTimeException e) {
            System.out.println(e);
        }

    }

    public static String formatDateShort(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    public static String formatDateMedium(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String formatDateFull(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public static OffsetDateTime parseOffsetDateTime(String dateString) {
        if (dateString.isEmpty()) {
            throw new DateTimeException("The string is empty and cannot be parsed");
        } else {
            return OffsetDateTime.parse(dateString);
        }
    }

}
