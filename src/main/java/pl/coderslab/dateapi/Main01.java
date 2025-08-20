package pl.coderslab.dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Main01 {
    public static void main(String[] args) {

        int yearCurrent = Year.now().getValue();

        for (int i = yearCurrent; i<=yearCurrent+10; i++) {
            LocalDate date = LocalDate.of(i, Month.DECEMBER, 24);
            System.out.println("date: " + date + " day of week: " + date.getDayOfWeek());
        }
    }
}
