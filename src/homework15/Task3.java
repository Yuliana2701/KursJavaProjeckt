package homework15;



import java.util.Scanner;


/**
 * @author Sergey Bugaenko
 * {@code @date} 18.02.2025
 */

/*
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).

Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке,
и программа завершает работу.

Проверить, является ли число "счастливым билетом".
 Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.

Примеры:
- Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
- Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число: ");
        String digitStr = scanner.nextLine();

        if (digitStr.length() != 4) {
            System.out.println("Сообщение об ошибке");
        } else {

            // 0..9 -> 48..57

            // Логика обратки этой строки
            int digit0 = digitStr.charAt(0) - '0';
            int digit1 = digitStr.charAt(1) - 48;

//            if (d0 + d1 == d2+ d3)

            if (digitStr.charAt(0) < 48 || digitStr.charAt(0) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0); // завершение работы программы
            }

            // Добавить такую проверку для всех 4-х символов


            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2) + digitStr.charAt(3)) {
                System.out.printf("Я хочу использовать цифры в выводе %s + %s = %s\n", digit0, digit1, digit0 + digit1);
                System.out.println("Число счастливое!");
            } else {
                System.out.println("Число не счастливое!");
            }
        }

        System.out.println("\n============ Opt 2 =============\n");

        if (digitStr.length() == 4) {
            // Код обработки строки. Вариант 2
            int input = Integer.parseInt(digitStr);
//            System.out.println("Я получил число из строки: " + input);

            // 1234
            int digit3 = input % 10;
            input = input / 10;

            // 123
            int digit2 = input % 10;
            input /= 10;

            // 12
            int digit1 = input % 10;
            int digit0 = input / 10;

            String result = (digit0 +digit1 == digit3+digit2) ? "Счастливое" : "Не является счастливым!";


            System.out.printf("Число %s -> (%d+%d) = %d; (%d+%d) = %d;  число %s\n",
                    digitStr, digit0, digit1, digit1 + digit0, digit2, digit3, digit2 +digit3, result);



        } else {
            System.out.println("Длина строки не 4 символа");
        }

    }
}

















