package homework16;

public class Task4 {
    public static void main(String[] args) {
        /*
Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15}
         */

        int[] num = {5, 6, -25, 0, 31, -15};

        System.out.print("Массив: ");
        int i = 0;
        while (i < num.length) {
            System.out.print(num[i] + " ");
            i++;
        }
        System.out.println();

        int min = 0;
        int max = 0;
        i = 1;
        while (i < num.length) {
            if (num[i] < num[min]) {
                min = i;
            }
            if (num[i] > num[max]) {
                max = i;
            }
            i++;
        }

        int result = num[min];
        num[min] = num[max];
        num[max] = result;

        System.out.print("Измененный массив: ");
        i = 0;
        while (i < num.length) {
            System.out.print(num[i] + " ");
            i++;
        }
    }
}