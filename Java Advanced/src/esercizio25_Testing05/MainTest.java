package esercizio25_Testing05;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

import static esercizio25_Testing05.Main.parseOffsetDateTime;
import static esercizio25_Testing05.Main.setDate;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public void testSetDate() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        date = setDate(date);

        OffsetDateTime expectedDate = OffsetDateTime.parse("2024-03-08T13:00:00Z");
        assertEquals(expectedDate, date);
    }

    @Test
    public void testParseEmptyString() {
        String emptyString = "";
        assertThrows(DateTimeException.class, () -> parseOffsetDateTime(emptyString));
    }
}