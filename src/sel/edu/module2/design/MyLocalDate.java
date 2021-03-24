package sel.edu.module2.design;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MyLocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, Month.JANUARY, 11);
        System.out.println(date.getDayOfWeek());
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusDays(100).getDayOfWeek());
        System.out.println(LocalDate.of(2021, Month.JANUARY, 1).plusDays(255));
        LocalDate birthday = LocalDate.of(1999, Month.AUGUST, 12);
        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDate.now()));

    }
}
