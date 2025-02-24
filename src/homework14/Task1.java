package homework14;

public class Task1 { public static void main(String[] args) {
        /*
        Задание 1
Дан текст Programming is fun

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.

         */

    String str = "Programming is fun";
    boolean contains = str.contains("fun");
    System.out.println("Содержит ли строка слово \"fun\":  " + str.contains("fun"));
}
}

