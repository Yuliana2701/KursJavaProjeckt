package homework17;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)

P.S. А почему вы решили, что число может прийти только положительное? ;)
         */
        printNumber(3);
        printNumber(-3);

    }

    public static void printNumber(int num) {
        int result = 1;
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                result *= 2;
            }
        } else if (num < 0) {
            for (int i = 0; i < -num; i++) {
                result /= 2;
            }
        }
        System.out.println(result);
    }
}