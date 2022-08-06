package Hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        System.out.println(findDay(8,05,2015));

    }

    public static String findDay(int month, int day, int year){
        LocalDate today = LocalDate.of(year,month,day);
        DayOfWeek dayOfMonth = today.getDayOfWeek();
        int currentDay = dayOfMonth.getValue();
        switch (currentDay){
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                return "NO SUCH DAY";
        }
    }
}
