package homework14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
         /*

         Задание 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Копировать
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.


          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        boolean number = (num % 2 == 0);
        boolean number1 = (num % 3 == 0);
        boolean number2 = number && number1;
        System.out.printf("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b%n",num, number, number1, number2);


    }

}
