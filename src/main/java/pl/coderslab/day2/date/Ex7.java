package pl.coderslab.day2.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Ex7 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(1970, Month.JANUARY, 1);
        LocalDate startDate2 = LocalDate.EPOCH;
        LocalDate nowDate = LocalDate.now();

        long monthsBetween = ChronoUnit.MONTHS.between(startDate, nowDate);
        long monthsBetween2 = ChronoUnit.MONTHS.between(startDate2, nowDate);
        System.out.println(monthsBetween);
        System.out.println(monthsBetween2);

    }
}
