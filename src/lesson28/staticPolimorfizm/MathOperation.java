package lesson28.staticPolimorfizm;
/*
В Java полиморфизм проявляется в двух формах:
1.Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов(Overloading)
2.Динамический(исполнительный) полиморфизм реализуется через переопределение методов(Overriding)
 */
public class MathOperation {
    static int summa(int a, int b) {
        return a + b;
    }

    static double summa(double a, double b) {
        return a + b;
    }

    static int summa(int a, int b, int c) {
        return a + b + c;


    }

    public static void main(String[] args) {

        System.out.println(summa(1, 2));

    }
}