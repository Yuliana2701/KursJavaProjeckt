package homework45;
/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String, Integer> getWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
    public static void main(String[] args) {
        String text = "Меня зовут Юлиана! Юлиана - мое имя!";
        Map<String, Integer> wordFrequency = getWordFrequency(text);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
