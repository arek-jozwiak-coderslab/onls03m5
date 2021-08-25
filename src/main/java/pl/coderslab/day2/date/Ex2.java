package pl.coderslab.day2.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(z-> System.out.println(z));
        availableZoneIds.stream()
                .filter(z -> z.contains("Europe"))
                .map(z -> z + " " + ZonedDateTime.now(ZoneId.of(z)))
                .forEach(System.out::println);
    }
}
