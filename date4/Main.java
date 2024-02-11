package date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        date = date.plusYears(1);
        date = date.minusMonths(1);
        date = date.plusDays(7);

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ITALY);
        String locale = date.format(formatter);
        System.out.println("Risultato localizzato per l'Italia: " + locale);
    }
}
