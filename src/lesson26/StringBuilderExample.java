package lesson26;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        //StringBuilder - то класс,который используется для создания
        // и манипулирования изменяемыми строками.
        // StringBuilder имеет перегруженный конструктор.Может быть пустым, может принимать String


        StringBuilder sb =new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");


        //Метод для добавления в конец строки(приклеивание справа).Аналог конкатенации
        sb.append(""); //"Hello" + " ";

        //Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

      //Метод. Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World");// Hello beautiful World
        sb.insert(6,"beautiful ");
        System.out.println(sb.toString());

        //Метод.Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!"); // "Hello Java"
        sb.replace(6,11,"Java");//замени все что было с 6-го по 11-й индекс на значение.Верхняя граница не включительно.
        System.out.println(sb.toString());

        //Метод удаления подстроки в диапазоне от start(вкл) до end(не вкл)
        sb = new StringBuilder("Hello World!");
        sb.delete(5,11);
        System.out.println(sb.toString());

        //Нам надо знать есть ли sb в какая-то подстрока.Положительный индекс,если нашел. И -1,если подстрока не найдена.
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);

        index = sb.lastIndexOf("Java");
        System.out.println(index);

        //Метод. Реверс разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        //Метод получения символа по индексу.
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        //Метод.Колличество символов в sb (длина)
        System.out.println("len" + sb.length());

        //Метод. Я могу установить новую длину. (обрезать или разширить sb)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        //Если увеличить строку,она будет заполнена char с кодом 0
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println(sb.length());

        /*
        Написать метод,который запрашивает у пользователя строку,состоящую из несколькиз слов
        и возвращающий аббревиатуру этой фразы)
        научно-исследовательский институт - НИИ
         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");//Метод класса String Результат- массив строк
        System.out.println(Arrays.toString(words));

        String str1 = "fstqws qqtqtwr";
        //могу получить массив символов,из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));











    }
}
