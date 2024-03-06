package testing4;

import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        OffsetDateTime date = getDate();
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfYear();
        String dayS = date.getDayOfWeek().toString().toLowerCase();
        System.out.println(year);
        assertEquals(2023, year);
        System.out.println(month);
        assertEquals(Month.MARCH, month);
        System.out.println(day);
        assertEquals(60, day);
        System.out.println(dayS);
        assertEquals("wednesday", dayS);
    }

    @org.junit.Test
    public void main2() {
        OffsetDateTime date = getDate();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        String dayS = date.getDayOfWeek().toString().toLowerCase();
        System.out.println(year);
        assertEquals(2023, year);
        System.out.println(month);
        assertEquals(3, month);
        System.out.println(day);
        assertEquals(1, day);
        System.out.println(dayS);
        assertEquals("wednesday", dayS);
    }

    public OffsetDateTime getDate() {
        return OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }
}
