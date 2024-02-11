package date2;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String longFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("LONG: " + longFormattedDate);
    }
}