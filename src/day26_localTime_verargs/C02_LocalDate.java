package day26_localTime_verargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.isLeapYear());
        LocalDate tarih2 = LocalDate.of(2020,10,10);

        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih.plusWeeks(10));

        System.out.println(tarih.getMonthValue()); //3

        System.out.println(tarih.getDayOfYear());//68

        System.out.println(tarih.getMonth());

        System.out.println(tarih.getMonthValue());

        LocalDate tarih3 = LocalDate.of(1977,12,13);

        System.out.println(tarih3.getDayOfWeek());

        System.out.println(tarih.isBefore(tarih3));

    }
}
