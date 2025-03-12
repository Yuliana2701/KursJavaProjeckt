package homework32.task1;
/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.+
Методы:
T getFirst() — возвращает первый элемент.+
T getSecond() — возвращает второй элемент.+
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */



public class Pair<T> {
    private T first;
    private T second;

    //Конструктор
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    //T getFirst() — возвращает первый элемент.
    public T getFirst() {
        return first;
    }
    //T getSecond() — возвращает второй элемент.
    public T getSecond() {
        return second;
    }

    // void setFirst(T value) — устанавливает значение первого элемента.
    public void setFirst(T value) {
        this.first = value;
    }

    // void setSecond(T value) — устанавливает значение второго элемента.
    public void setSecond(T value) {
        this.second = value;
    }

    // void swap() — меняет местами первый и второй элементы.
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }
    }

