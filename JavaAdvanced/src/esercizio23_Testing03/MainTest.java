package esercizio23_Testing03;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static esercizio23_Testing03.Main.formatLong;
import static esercizio23_Testing03.Main.parseOffsetDateTime;
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
    public void testingDateStringLong() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime date = parseOffsetDateTime(dateString);
        String dateStringLong = formatLong(date);
        String testDateStringLong = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        assertEquals(testDateStringLong, dateStringLong);
    }

    @Test
    public void testParseEmptyString() {
        String emptyString = "";
        assertThrows(DateTimeException.class, () -> parseOffsetDateTime(emptyString));
    }

}