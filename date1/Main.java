package date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String fullFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL: " + fullFormattedDate);

        String mediumFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MEDIUM: " + mediumFormattedDate);

        String shortFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("SHORT: " + shortFormattedDate);
    }
}