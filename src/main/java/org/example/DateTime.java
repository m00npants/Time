package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



public class DateTime {
      void main() {
        // Exercise 1
        LocalDate today = LocalDate.now();
        System.out.println("Exercise 1: " + today);

        // Exercise 2
        DateTimeFormatter swedishFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));
        System.out.println("Exercise 2: " + today.format(swedishFormatter));

        // Exercise 3
        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);
        System.out.println("Exercise 3:");
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }

        // Exercise 4
        LocalDate parsedDate = LocalDate.parse("2025-12-02");
        System.out.println("Exercise 4: " + parsedDate);

        // Exercise 5
        LocalDate birthday = LocalDate.of(1985, 5, 20);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println("Exercise 5: " + dayOfWeek);

        // Exercise 6
        LocalDate futureDate = today.plusYears(10).minusMonths(10);
        Month futureMonth = futureDate.getMonth();
        System.out.println("Exercise 6: " + futureMonth);

        // Exercise 7
        Period periodBetween = Period.between(birthday, futureDate);
        System.out.println("Exercise 7: " + periodBetween.getYears() + " years, " +
                periodBetween.getMonths() + " months, " + periodBetween.getDays() + " days");

        // Exercise 8
        Period customPeriod = Period.of(4, 7, 29);
        LocalDate newDate = today.plus(customPeriod);
        System.out.println("Exercise 8: " + newDate);

        // Exercise 9
        LocalTime currentTime = LocalTime.now();
        System.out.println("Exercise 9: " + currentTime);

        // Exercise 10
        int nanos = currentTime.getNano();
        System.out.println("Exercise 10: " + nanos);

        // Exercise 11
        LocalTime parsedTime = LocalTime.parse("10:32:53");
        System.out.println("Exercise 11: " + parsedTime);

        // Exercise 12
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Exercise 12: " + currentTime.format(timeFormatter));

          // Exercise 13
          LocalDateTime dateTime13 = LocalDateTime.of(2018, 4, 5, 10, 0);
          System.out.println("Exercise 13: " + dateTime13);

          // Exercise 14
          DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv", "SE"));
          String formattedDateTime = dateTime13.format(swedishFormatter);
          System.out.println("Exercise 14: " + formattedDateTime);

          // Exercise 15
          LocalDate date = LocalDate.of(2023, 12, 2);
          LocalTime time = LocalTime.of(14, 30);
          LocalDateTime combinedDateTime = LocalDateTime.of(date, time);
          System.out.println("Exercise 15: " + combinedDateTime);

          // Exercise 16
          LocalDateTime now = LocalDateTime.now();
          LocalDate extractedDate = now.toLocalDate();
          LocalTime extractedTime = now.toLocalTime();
          System.out.println("Exercise 16:");
          System.out.println("LocalDate: " + extractedDate);
          System.out.println("LocalTime: " + extractedTime);

          // Extra : Calendar for 2018
          System.out.println("Extra : Calendar for 2018");
          LocalDate start2018 = LocalDate.of(2018, 1, 1);
          LocalDate end2018 = LocalDate.of(2018, 12, 31);
          DateTimeFormatter calendarFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));

          while (!start2018.isAfter(end2018)) {
              System.out.println(start2018.format(calendarFormatter));
              start2018 = start2018.plusDays(1);
          }

      }

}
