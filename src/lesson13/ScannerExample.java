package lesson13;


import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 13.02.2025
 */

public class ScannerExample {
    public static void main(String[] args) {

        // Строка подготавливает программу для чтения данных из стандартного потока ввода
        // от пользователя через клавиатуру

        Scanner scanner = new Scanner(System.in);

        //Прочитать строку
        System.out.println("Введите ваше имя: ");
        // читает всю строку введенную пользователем - и возвращает ее в виде String
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt(); // Считает одно число типа int
        System.out.println("Age: " + age);

        System.out.println("Введи город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        // Todo Чтение токенами чисел

    }
}
