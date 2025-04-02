package homework47;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
       /* Task 2
        Дан список строк.

         Используя Stream API, отфильтруйте строки,
          которые начинаются на определенную букву (например, "A")
           и отсортируйте их в алфавитном порядке.

        Результат сохраните в новый список строк.

        */
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Cherry","Ananas", "Grapes");

        List<String> filterAndSortedStrings = strings.stream()
                        .filter(str -> str.startsWith("A"))
                        .sorted()
                        .collect(Collectors.toList());


                System.out.println(filterAndSortedStrings);
            }
        }


