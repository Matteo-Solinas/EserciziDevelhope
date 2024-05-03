package esercizio24_Testing04;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static esercizio24_Testing04.Main.dateFormatLocalizedIta;
import static esercizio24_Testing04.Main.parseOffsetDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    public void testingParseDate() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime date = parseOffsetDateTime(dateString);
        OffsetDateTime testDate = OffsetDateTime.parse(dateString);
        assertEquals(testDate, date);
    }

    @Test
    public void testingDateFormatLocalizedIta() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime date = parseOffsetDateTime(dateString);
        String dateStringLocalizedIta = dateFormatLocalizedIta(date);
        String testDateStringLocalizedIta = date.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss", Locale.ITALY));
        assertEquals(testDateStringLocalizedIta, dateStringLocalizedIta);
    }

    @Test
    public void testParseEmptyString() {
        String emptyString = "";
        assertThrows(DateTimeException.class, () -> parseOffsetDateTime(emptyString));
    }

}