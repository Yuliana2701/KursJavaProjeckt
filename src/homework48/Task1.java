package homework48;
/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);

        List<Integer>list = integers.stream()
                .filter(integer -> integer > 10)
                .sorted(Comparator.comparing(i-> i %10))
                .collect(Collectors.toList());

        System.out.println("list: " + list);

    }
}
