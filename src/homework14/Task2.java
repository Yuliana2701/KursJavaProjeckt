package homework14;

public class Task2 { public static void main(String[] args) {
        /*
        Задание 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.

         */
    int a = 25;
    int b = 48;

    boolean b1 = a == b;
    System.out.printf("%s == %s -> %s\n", a, b, b1);
    boolean b2 = a != b;
    System.out.printf("%s != %s -> %s\n", a, b, b2);
    boolean b3 = a > b;
    System.out.printf("%s > %s -> %s\n", a, b, b3);
    boolean b4 = b < a;
    System.out.printf("%s < %s -> %s\n", b, a, b4);

    System.out.println("\n=======================\n");

    int d = 20;
    int c = -5;
    boolean bol = d == c;
    System.out.printf("%s == %s -> %s\n", d, c, bol);
    boolean bol1 = d != c;
    System.out.printf("%s != %s -> %s\n", d, c, bol1);
    boolean bol2 = d > c;
    System.out.printf("%s > %s -> %s\n", d, c, bol2);
    boolean bol3 = c < d;
    System.out.printf("%s < %s -> %s\n", c, d, bol3);



}
}

