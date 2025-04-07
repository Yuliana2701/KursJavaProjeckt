package homework50;
/*
Task 3
Написать метод, принимающий список из нескольких дат типа LocalDate
 и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // Пример использования метода
        List<LocalDate> dates = List.of(
                LocalDate.of(2025, 2, 10),
                LocalDate.of(2024, 3, 25),
                LocalDate.of(2023, 8, 15)
        );

        long daysBetween = getDaysBetweenEarliestAndLatest(dates);
        System.out.println("Количество дней между самой ранней и самой поздней датой: " + daysBetween);
    }

    public static long getDaysBetweenEarliestAndLatest(List<LocalDate> dates) {

        LocalDate earliestDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate latestDate = dates.stream().max(LocalDate::compareTo).orElseThrow();

        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }
}



