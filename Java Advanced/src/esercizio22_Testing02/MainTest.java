package esercizio22_Testing02;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static esercizio22_Testing02.Main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    public void testParseOffsetDateTime() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime date = parseOffsetDateTime(dateString);
        OffsetDateTime testDate = OffsetDateTime.parse(dateString);
        assertEquals(testDate, date);
    }

    @Test
    public void testFormatDateShort() {
        OffsetDateTime dateString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateStringShort = formatDateShort(dateString);
        String testDateShort = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        assertEquals(testDateShort, dateStringShort, "It should return the date in this format: 01/03/02");
    }

    @Test
    public void testFormatDateMedium() {
        OffsetDateTime dateString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateStringMedium = formatDateMedium(dateString);
        String testStringMedium = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        assertEquals(testStringMedium, dateStringMedium, "It should return the date in this format: 1 mar 2002");
    }

    @Test
    public void testFormatDateFull() {
        OffsetDateTime dateString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateStringFull = formatDateFull(dateString);
        String testStringFull = dateString.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertEquals(testStringFull, dateStringFull, "It should return the date in this format: venerdì 1 marzo 2002");
    }

    @Test
    public void testParseEmptyString() {
        String emptyString = "";
        assertThrows(DateTimeException.class, () -> parseOffsetDateTime(emptyString));
    }

}