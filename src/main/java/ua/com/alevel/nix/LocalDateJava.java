package ua.com.alevel.nix;

import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Iehor Funtusov, created 19/07/2020 - 11:38 AM
 */

public class LocalDateJava {

    public void dateTest() {
//        LocalDate date = LocalDate.now();
//        int year = date.getYear();
//        int month = date.getMonthValue();
//        int dayOfMonth = date.getDayOfMonth();
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(date);
//        System.out.println(dayOfWeek);
//        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
//
//        date = LocalDate.of(2020, 6, 30);
//        System.out.println("date = " + date);


//        Instant instant = Clock.systemDefaultZone().instant();
//        System.out.println("instant = " + instant.toString());
//
//        ZoneId zoneId = ZoneId.of("Europe/Zaporozhye");
//        System.out.println("zoneId = " + zoneId.getId());
//
//        zoneId = ZoneId.of("UTC");
//        System.out.println("zoneId = " + zoneId.getId());
//
//        zoneId = ZoneId.of("UTC+5");
//
//        LocalDateTime dateTime = LocalDateTime.now(zoneId);
//        System.out.println("dateTime = " + dateTime.getHour());
//
//        instant = Clock.systemDefaultZone().instant();
//        System.out.println("instant = " + instant.getNano());
//        System.out.println("instant = " + Clock.systemDefaultZone().instant().getNano());
//        System.out.println("instant = " + Clock.systemDefaultZone().instant().getNano());
//        System.out.println("instant = " + Clock.systemDefaultZone().instant().getNano());
//        System.out.println("instant = " + Clock.systemDefaultZone().instant().getNano());
//
//        List<Instant> instants = Arrays.asList(Clock.systemDefaultZone().instant(), Clock.systemDefaultZone().instant(), Clock.systemDefaultZone().instant());
//        List<Integer> longs = instants.stream().map(Instant::getNano).collect(Collectors.toList());
//        longs.forEach(System.out::println);

        OffsetTime offsetTime = OffsetTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        System.out.println("offsetTime = " + offsetTime);
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}
