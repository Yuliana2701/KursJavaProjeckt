package lesson30.interfaces;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М.Булгаков");
        book.print();
        book.defaultMethod();

        Journal journal = new Journal("Cosmolitan", 154);
        journal.print();
        journal.defaultMethod();

        //Тип ссылки типа интерфейс
        //Набор методов,доступных по ссылке-методы,которые прописаны в интерфейсе
        //Обьект класса,который реализовал интерфейс

        Printable printable = journal;//неявное автоматическое приведение типа ссылки

        Printable printable1 = new Book("Философия Java", "Б. Эккель");
        printable1.print();

        Printable.testStaticMethod("Hello!");

        ColorPrintAble presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP"
        );
        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();


    }
}
