package esercizio24_Testing04;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
       Ottieni l'anno, ottieni il mese, ottieni il giorno, ottieni il giorno della settimana;
       Stampa i risultati sulla console;
       Crea dei test per questo esercizio; */
    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        String testEmptyString = "";

        OffsetDateTime date = parseOffsetDateTime(dateString);
        String dateLocalizedIta = dateFormatLocalizedIta(date);

        System.out.println("Data: " + dateLocalizedIta);
        System.out.println("Anno: " + date.getYear());
        System.out.println("Mese: " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY));
        System.out.println("Giorno: " + date.getDayOfMonth());
        System.out.println("Giorno della settimana: " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY));

        try {
            OffsetDateTime testDate = parseOffsetDateTime(testEmptyString);
            System.out.println(testDate);
        } catch (DateTimeException e) {
            System.out.println(e);
        }
    }

    static String dateFormatLocalizedIta(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss", Locale.ITALY));
    }

    static OffsetDateTime parseOffsetDateTime(String dateString) {
        if (dateString.isEmpty()) {
            throw new DateTimeException("The string is empty and cannot be parsed");
        } else {
            return OffsetDateTime.parse(dateString);
        }
    }
}
