package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateTime {
    void main(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime" + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        LocalDate specificDate = LocalDate.of(2025,12,2);
        System.out.println("specificDate = " + specificDate);





    }
}
