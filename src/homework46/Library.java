package homework46;
/*
Task 2
Поиск книги в библиотеке
Создайте класс Library, в котором хранится список книг. У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:
Создайте класс Book с полями title и author, и сделайте для них геттеры.+
Создайте класс Library, в котором будет список книг.+
Реализуйте метод findBookByTitle, который ищет книгу по названию.+
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private static List<Book> books= new ArrayList<>();

    static {
        books.add(new Book("Колобок", "Народная сказка"));
        books.add(new Book("Мертвые Души", "Н.В.Гоголь"));
        books.add(new Book("Мастер и Маргарита", "М.А.Булгаков"));
        books.add(new Book("Медный Всадник", "А.С.Пушкин"));

    }
    public static Optional<Book> findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Book> foundBook1 = findBookByTitle("Мастер и Маргарита");
        foundBook1.ifPresentOrElse(
                book -> System.out.println("Книга найдена: " + book),
                () -> System.out.println("Книга не найдена")
        );

        Optional<Book> foundBook2 = findBookByTitle("Война и мир");
        foundBook2.ifPresentOrElse(
                book -> System.out.println("Книга найдена: " + book),
                () -> System.out.println("Книга не найдена")
        );




    }

}
