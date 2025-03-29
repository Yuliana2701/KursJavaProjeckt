package homework44;
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке
 */
import java.util.*;

public class Task1 {

    public static List<String> getUniqueSortedWords(String testString) {

        String newString = testString.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        String[] words = newString.split("\\s+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        List<String> sortedWords = new ArrayList<>(uniqueWords);

        sortedWords.sort((w1, w2) -> {

            int lengthComparison = Integer.compare(w1.length(), w2.length());
            if (lengthComparison == 0) {

                return w1.compareTo(w2);
            }
            return lengthComparison;
        });

        return sortedWords;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }
}