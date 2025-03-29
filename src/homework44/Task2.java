package homework44;
/*
Task 2
Создайте два множества строк (Set<String>),+
 каждое из которых будет заполнено различными словами.
 Некоторые слова должны повторяться в обоих множествах.

Реализуйте метод union(Set<String> set1, Set<String> set2),+
 который возвращает множество, содержащее все уникальные элементы из обоих множеств
 (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2),+
который возвращает множество, содержащее только элементы,
которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2),+
который возвращает множество элементов, которые есть в первом множестве,
 но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные,
 так и общие элементы для наглядности результатов операций.
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);


        System.out.println("=======================================\n");
        Set<String> resultSet = union(set1, set2);
        System.out.println("Union: " + resultSet);

        System.out.println("=======================================\n");
        Set<String> resultSet1 = intersection(set1, set2);
        System.out.println("intersection: " + resultSet1);

        System.out.println("=======================================\n");
        Set<String> resultSet2 = difference(set1, set2);
        System.out.println("difference: " + resultSet2);

    }
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);

        return resultSet;
    }
    public static Set<String> intersection(Set<String> set1, Set<String> set2){
        Set<String> resultSet1 = new HashSet<>(set1);
        resultSet1.retainAll(set2);

        return resultSet1;

    }
    public static Set<String> difference(Set<String> set1, Set<String> set2){
        Set<String> resultSet2 = new HashSet<>(set1);
        resultSet2.removeAll(set2);

        return resultSet2;
    }


    }










