package homework32.task3;
/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
 */

public class NumericPair <T extends Number>{
    private T a;
    private T b;

    public NumericPair(T a, T b) {
        this.a = a;
        this.b = b;
    }
    public double sum(){
        return a.doubleValue() + b.doubleValue();
    }
}
