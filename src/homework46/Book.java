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
Создайте класс Library, в котором будет список книг.
Реализуйте метод findBookByTitle, который ищет книгу по названию.
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author;
    }
}
