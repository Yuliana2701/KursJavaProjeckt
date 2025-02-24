package homework16;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран

         */
        int result = 1;
        int i = 1;
        while (i <= 15) {
            result *= i;
            i ++;
        }


        System.out.println("Произведение чисел от 1 до 15: " + result);
    }
}