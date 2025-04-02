package homework47;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    /*
    Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные
, больше 10
и меньше 100

Для фильтрации используйте Stream API
     */
    public static void main(String[] args) {
        List<Integer>integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);

        List<Integer> integerList = integers.stream()
                .filter(integer-> integer > 10)
                .filter(integer-> integer < 100)
                .filter(integer -> integer % 2 == 0)    // Число должно быть четным
                .collect(Collectors.toList());

        System.out.println(integerList);

    }

}

