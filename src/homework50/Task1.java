package homework50;
/*
Task 2
Получить и вывести на экран:
текущую дату+
текущий год, месяц и день+
Создать дату, например Ваш день рождения и вывести на экран+
Создать две даты и проверить на равенство+
Получить и вывести на экран:
текущее время+
текущее время + 3 часа+
Создать дату:
которая на неделю позже сегодняшней+
которая была на год раньше сегодняшней используя метод minus+
которая на год позже сегодняшней+
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней+
 */


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date);

        System.out.println("\n=========================");

        LocalDate date1 = LocalDate.of(2025,Month.APRIL, 7);
        System.out.println("текущий год, месяц и день : " + date1);

        System.out.println("\n=========================");
        LocalDate myBirthday = LocalDate.of(1988,Month.JANUARY, 27);
        System.out.println("myBirthday: " + myBirthday);

        System.out.println("\n=========================");

        LocalDate date2 = LocalDate.of(2025, 10, 16);
        LocalDate date3 = LocalDate.of(2025, 6, 27);

        System.out.println("date2.equals(date3): " + date2.equals(date3));
        System.out.println("\n=========================");

        /*
        Получить и вывести на экран:
текущее время+
текущее время + 3 часа+
         */
        LocalTime time = LocalTime.now();
        System.out.println("Текущее время: " + time);
        LocalTime time1= time.plusHours(3);
        System.out.println("now.plusHours(1): " + time1);

        System.out.println("\n=========================");
        /*
        Создать дату:
которая на неделю позже сегодняшней+
которая была на год раньше сегодняшней используя метод minus+
которая на год позже сегодняшней+
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней+
         */

        LocalDate tomorrowDate = date.plusWeeks(1);
        System.out.println("tomorrowWeeks : " + tomorrowDate);
        System.out.println("minusYear : " + date.minusYears(1));
        System.out.println("plusYear : " + date.plusYears(1));
        System.out.println("tomorrow : " + date.plusDays(1));
        System.out.println("yesterday : " + date.minusDays(1));
        System.out.println("Is tomorrow after today? " + tomorrowDate.isAfter(date));
        System.out.println("Is yesterday before today? " + tomorrowDate.isBefore(date));



    }
}
