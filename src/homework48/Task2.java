package homework48;
/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной
 */

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Cherry", "Grapes");

      Optional<String> minString = strings.stream()
              .min(String::compareTo);

        System.out.println("minString: " + minString);

    }
}
