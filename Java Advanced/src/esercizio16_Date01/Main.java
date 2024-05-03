package esercizio16_Date01;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    /* Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z;
       Formatta la data ottenuta in FULL, MEDIUM e SHORT;
       Stampa le varie versioni; */

    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateStringFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateStringMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateStringShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Formato data Full: " + dateStringFull);
        System.out.println("Formato data Medium: " + dateStringMedium);
        System.out.println("Formato data Short: " + dateStringShort);

    }

}
