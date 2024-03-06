package testing5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

public class MainTest {

    @Test
    public void main() {
        OffsetDateTime date = getDate();
        date = date.plusYears(1);
        date = date.minusMonths(1);
        date = date.plusDays(7);
        System.out.println(date);
    }

    public OffsetDateTime getDate() {
        return OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }
}