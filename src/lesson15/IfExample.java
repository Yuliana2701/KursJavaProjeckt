package lesson15;

import java.util.Random;
// Ctrl + Opt + O // Ctrl + Alr + O - оптимизировать импорты (удалить неиспользуемые)

/**
 * @author Sergey Bugaenko
 * {@code @date} 17.02.2025
 */

public class IfExample {
    public static void main(String[] args) {

        // Условный оператор if - позволяет выборочно выполнять отдельные части программы (блоки кода)

/*
       if (условие) оператор;
       else оператор; // в т.ч. это может быть {}


       if (условие) {
            // Код при условие = true
       } else if (условие 2) {
             // Код при условие 2 = true
       } else {
            // Код при условие = false
       }
 */

        int age = 5;

        if (age >= 18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вам меньше 18");

        System.out.println("Продолжение программы");

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {
            // Блок кода else (выполнится, когда условие выдаст false)
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age = " + age);
        }

        System.out.println("\n===============\n");

        Random rand = new Random();

        int score = rand.nextInt(101); // получить случайное число в диапазоне от 0 до 100

        if (score >= 90) {
            System.out.println("Супер! " + score);
        } else if (score >= 75) {
            System.out.println("Хорошо! " + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно " + score);
        } else {
            System.out.println("Плохо! " + score);
        }

        System.out.println("Продолжение программы");


//        int v2 = rand.nextInt(51) - 25; //  (0...50) -- -0-25 -> -25; 50 - 25 = max = 25;

        // -25 до +25

        // -20 до 80 ->
//        int r4 = rand.nextInt(101) - 20;
        // Java 17 or higher
//        r4 = rand.nextInt(10, 70);
//        System.out.println("r4: " + r4);


        // Нахождение min из нескольких чисел
        int v1 = rand.nextInt(51); // случайное число от 0 до 50 вкл.
        int v2 = rand.nextInt(51); //
        int v3 = rand.nextInt(51);

        System.out.println(v1 + " | " + v2 + " | " + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println("min: " + min);

    }
}














