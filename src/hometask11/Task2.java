package hometask11;

public class Task2 {
    public static void main(String[] args) {
        /*

        Task 02
В пакете с домашним заданием создайте класс Task02 с методом main. Задекларировать (объявить) и присвоить значения 3-м переменным.
 Правильно подберите тип и имя переменным.

Переменная 1 - сколько Вам полных лет
Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных можно хранить текст. (Гугл?))
         */
        int youAge;
        youAge = 25;
        System.out.println("Сколько Вам полных лет " + youAge);

        double packetMilchPrice;
        packetMilchPrice = 1.45;
        System.out.println("Cтоимость одного  литра молока в Вашей стране : " + packetMilchPrice );

        String yourName;
        yourName = "Yuliana";
        System.out.println("Ваше имя : " + yourName);

    }
}
