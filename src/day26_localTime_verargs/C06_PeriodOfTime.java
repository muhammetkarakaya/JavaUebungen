package day26_localTime_verargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {
        LocalDate dogumGunu = LocalDate.of(1977,12,13);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumGunu, bugun)); //P45Y2M24D
        System.out.println("Yas" + Period.between(dogumGunu,bugun).getYears()); //Yas45
        System.out.println("Yas" + Period.between(dogumGunu,bugun).getDays()); //Yas24

    }
}
