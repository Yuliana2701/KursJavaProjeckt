package homework29.shapes;
/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.+
Реализуйте классы-наследники Circle, Rectangle, и Triangle.+
Убедитесь, что все классы правильно вычисляют площадь и периметр.+
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.+
 */
public abstract class Shape {

    public abstract double areaShape();


    public abstract double perimeterShape();
}