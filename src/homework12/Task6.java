package homework12;

public class Task6 {   public static void main(String[] args) {
        /*
        Task 6 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.

         */

    long bigNumber = 15000000000L;
    int smallNumber = (int) bigNumber;
    System.out.println("Значение smallNumber: " + smallNumber);
}
}

