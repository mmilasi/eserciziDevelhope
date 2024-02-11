package date3;
import java.time.DayOfWeek;
import java.time.OffsetDateTime;


public class Main {

    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day of the month: " + dayOfMonth);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
