package homework48;
/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
 оставив только чётные числа,
 затем каждое число умножить на 2,
  и собрать результат в новый список
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);
        List<Integer>integerList = integers.stream()
                .filter(integer -> integer % 2 ==0)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println("integerList: " + integerList);

    }
}
