package homework48;
/*
Задания:
Группировка по специальности+
Сгруппируй студентов по специальности (поле major) в Map<String, List>.+

Группировка по курсу с использованием Set+
Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.+

Подсчёт количества студентов по специальности+
Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.+

Средний балл по специальности+
Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.+

Список оценок по специальности+
Построй Map<String, List>, где хранятся только оценки по каждой специальности.+

Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:

минимальный возраст,
максимальный возраст,
средний возраст,
общее количество студентов,
сумму всех возрастов.
 */

import groupingBy.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Petr", 23, "Menagment", 2022, 4.3),
                        new Student("Silvia", 19, "Menagment", 2023, 3.7),
                        new Student("Stefan", 19, "Menagment", 2021, 3.3),
                        new Student("Olivia", 18, "Economist", 2024, 3.6),
                        new Student("Sebastian", 18, "Economist", 2023, 3.9),
                        new Student("Hanna", 21, "Economist", 2022, 4.1),
                        new Student("Max", 22, "Buhalter", 2023, 5.0),
                        new Student("John", 22, "Buhalter", 2024, 5.0),
                        new Student("Irina", 23, "Tourism",2021, 5.0),
                        new Student("David",18,"Tourism",2024, 4.7)

                )
        );
        //Сгруппируй студентов по специальности (поле major) в Map<String, List>.
        Map<String, List<Student>>map = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));
        System.out.println("Группировка по специальности: ");
        map.forEach((major, studentList) -> System.out.println(major + ": " + studentList));

        System.out.println("=========================================================\n");

        //Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.+

        Map<Integer, Set<Student>> byYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));
        System.out.println("Группировка по курсу : ");
        byYear.forEach((year, studentSet) -> System.out.println(year + ": " + studentSet));

        System.out.println("=========================================================\n");

        //Построй Map<String, Long>, где ключ — специальность,
        // а значение — количество студентов на этой специальности.
        Map<String, Long> majorCountMap = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        System.out.println("Подсчёт количества студентов по специальности:");
        majorCountMap.forEach((major, count) -> System.out.println(major + ": " + count));

        System.out.println("=========================================================\n");
        //Построй Map<String, Double>,
        // где ключ — специальность, а значение — средняя оценка студентов на этой специальности.

        Map<String, Double> majorGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.averagingDouble(Student::getGrade)));
        System.out.println("Средний балл по специальности: ");
        majorGrade.forEach((major, grade)-> System.out.println(major + ": " + grade));

        System.out.println("=========================================================\n");

        //Построй Map<String, List>, где хранятся только оценки по каждой специальности.

        Map<String, List<Double>> gradeByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));
        System.out.println("Список оценок по специальности: ");
        gradeByMajor.forEach((major,grade)-> System.out.println(major + ": " + grade));

        System.out.println("=========================================================\n");

        /*
        Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:

минимальный возраст,+
максимальный возраст,+
средний возраст,+
общее количество студентов,+
сумму всех возрастов.+
 */
        IntSummaryStatistics ageStats = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));

        // Выводим статистику
        System.out.println("Минимальный возраст: " + ageStats.getMin());
        System.out.println("Максимальный возраст: " + ageStats.getMax());
        System.out.println("Средний возраст: " + ageStats.getAverage());
        System.out.println("Общее количество студентов: " + ageStats.getCount());
        System.out.println("Сумма всех возрастов: " + ageStats.getSum());
        System.out.println("Полная статистика: " + ageStats);
    }
}
