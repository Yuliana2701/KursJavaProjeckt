package homework25;
/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutablePoint {
    private final int x;
    private final int y;

    //Конструктор
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int setX(){
        return x;
    }
    public int setY(){
        return y;
    }
}
