package pl.coderslab.day2.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SampleDates {

    public static void main(String[] args) {
        long diff = ChronoUnit.MONTHS.between(LocalDate.of(1983, 12, 18), LocalDateTime.now());
        System.out.println(diff);
        long diff2 = ChronoUnit.WEEKS.between(LocalDate.of(1983, 12, 18), LocalDateTime.now());
        System.out.println(diff2);
        long diff3 = ChronoUnit.DAYS.between(LocalDate.of(1983, 12, 18), LocalDateTime.now());
        System.out.println(diff3);
        long diff4 = ChronoUnit.HOURS.between(LocalDateTime.of(1983, 12, 18, 10, 0, 0), LocalDateTime.now());
        System.out.println(diff4);
        long diff5 = ChronoUnit.MINUTES.between(LocalDateTime.of(1983, 12, 18, 10, 0, 0), LocalDateTime.now());
        System.out.println(diff5);
        long diff6 = ChronoUnit.SECONDS.between(LocalDateTime.of(1983, 12, 18, 10, 0, 0), LocalDateTime.now());
        System.out.println(diff6);
    }
}
