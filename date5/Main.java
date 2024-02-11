package date5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args ) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(date1.isBefore(date2));
        System.out.println(date2.isAfter(date1));
        System.out.println(date1.isEqual(date2));


    }
}
