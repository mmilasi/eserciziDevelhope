package testing4;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        String dayS = date.getDayOfWeek().toString().toLowerCase();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayS);
    }
}
