package lesson14;


import java.util.Locale;
import java.util.Scanner;



public class ScannerLocale {
    public static void main(String[] args) {

//        String data = "3,14 42,7";
        String data = "3.14 42.7";
        Scanner sc = new Scanner(data);

        sc.useLocale(Locale.US);
//        sc.useLocale(Locale.GERMANY);

        // Locale - используется локаль вашей системы для определения формата чисел.
        // В том числе каким знаком отделяется дробная часть числа

        // Locale.US - дробная часть отделяется точкой (.)
        // Locale.GERMANY - дробная часть отделяется запятой (б)

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());
        System.out.println(Locale.getDefault());

        System.out.println("\n===============\n");

        String text = "42 ,Java,3.14  , Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
//        scanner.useDelimiter(",");
//        scanner.useDelimiter("[;|]"); // Разделитель ; или |
        scanner.useDelimiter("\\s*,\\s*"); // Разделитель ; или |

        System.out.println(scanner.nextInt());
        String java  = scanner.next(); // считает ОДИН токен, возвращает String - строку
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());

        scanner.reset(); // вернуться к стандартному разделителю



    }
}

