package homework13;

import java.util.Scanner;

public class Task1 { public static void main(String[] args) {
        /*
        Task 1
1. Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
2. Используя Scanner, сохраните имя в переменную типа String.
3. Выведите на экран количество символов в имени пользователя.
4. Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
5. Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

         */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите ваше имя: ");

    String name = scanner.nextLine();
    System.out.println("Name: " + name);

    String name1 = "Yuliana";
    int lenghtName = name1.length();
    System.out.println("lenghtName: " + lenghtName);

    String name2 = "Yuliana";

    char firstLater = name2.charAt(0);
    char lastLater = name2.charAt(name2.length() - 1);
    System.out.println("firstLater: " + firstLater);
    System.out.println("lastLater : " + lastLater);

    System.out.println("firstLater: "  + (int) firstLater);
    System.out.println("lastLater: " + (int) lastLater);

}
}

