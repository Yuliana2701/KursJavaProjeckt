package homework35;

import java.util.Objects;
public class Rectangle{
/*
    Task 1: Создание класса “Rectangle”+
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

length (длина) — тип double+
width (ширина) — тип double+
Требования:
Конструкторы:
Создайте конструктор, который инициализирует оба поля класса.+
Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.+
Методы:
Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]".+
Метод main():
В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().+
     */
private double length;
private double width;

public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}

public Rectangle() {
    this.length = 1.0;
    this.width = 1.0;

}

@Override
public String toString() {
    return "Reсtangle{" +
            "length=" + length +
            ", width=" + width +
            '}';
}

public double getLength() {
    return length;
}

public void setLength(double length) {
    this.length = length;
}

public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}
    /*
    Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них совпадают значения полей length и width.
Метод main():
Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.
     */

@Override
public boolean equals(Object o) {
    if (!(o instanceof Rectangle)) return false;
    Rectangle that = (Rectangle) o;
    return Double.compare(length, that.length) == 0 && Double.compare(width, that.width) == 0;
}

@Override
public int hashCode() {
    return Objects.hash(length, width);
}
}
