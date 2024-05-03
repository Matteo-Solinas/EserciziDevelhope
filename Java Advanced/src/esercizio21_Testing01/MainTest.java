package esercizio21_Testing01;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void testComparDate() {
        OffsetDateTime dateParse1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateParse2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        assertTrue(dateParse1.isBefore(dateParse2), "dateParse1 dovrebbe essere antecedente a dateParse2");
        assertTrue(dateParse2.isAfter(dateParse1), "dateParse2 dovrebbe essere precedente a dateParse1");
        assertFalse(dateParse1.isEqual(dateParse2), "dateParse1 e dateParse2 non dovrebbero essere uguali");
    }


}