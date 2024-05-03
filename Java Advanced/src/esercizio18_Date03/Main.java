package esercizio18_Date03;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z;
       Ottieni l'anno, ottieni il mese, ottieni il giorno ,ottieni il giorno della settimana;
       Stampa i risultati sulla console; */

    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dateLocalizedIta = date.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss", Locale.ITALY));

        System.out.println("Data: " + dateLocalizedIta);
        System.out.println("Anno: " + date.getYear());
        System.out.println("Mese: " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY));
        System.out.println("Giorno: " + date.getDayOfMonth());
        System.out.println("Giorno della settimana: " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY));

    }

}
