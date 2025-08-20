package pl.coderslab.dateapi;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Main03 {
    public static void main(String[] args) {
        LocalDate dateStart = LocalDate.of(1970, 01, 01);
        LocalDate dateEnd = LocalDate.now();

        int numOfYears = dateEnd.compareTo(dateStart);
        int numOfMonths = numOfYears * 12 + 7;

        System.out.println(numOfMonths);

        Period period = Period.between(dateStart, dateEnd);
        System.out.println(period.getYears()*12 + period.getMonths());

    }
}
