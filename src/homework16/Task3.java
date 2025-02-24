package homework16;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 5
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
         */

        Random random = new Random();

        int length = random.nextInt(10) + 5;
        int[] num = new int[length];

        int i = 0;
        while (i < num.length) {
            num[i] = random.nextInt(101) - 50;
            i++;
        }

        System.out.print("Массив: ");
        i = 0;
        while (i < num.length) {
            System.out.print(num[i] + " ");
            i++;
        }
        System.out.println();

        int min = num[0];
        i = 1;
        while (i < num.length) {
            if (num[i] < min) {
                min = num[i];
            }
            i++;
        }
        System.out.println("min: " + min);

        int max = num[0];
        i = 1;
        while (i < num.length) {
            if (num[i] > max) {
                max = num[i];
            }
            i++;
        }
        System.out.println("max: " + max);

        int sum = 0;
        i = 0;
        while (i < num.length) {
            sum += num[i];
            i++;
        }
        double average = (double) sum / num.length;
        System.out.println("Среднее арифметическое: " + average);
    }
}