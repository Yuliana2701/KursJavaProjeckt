package lesson30.interfaces;

//Интерфейс содержит только поведение,которое

public interface Printable {
    //Интерфейс - это совокупность абстрактных методов,задающих поведение
    //Интерфейс - косвенно-абстрактный.Ключевое слово abstract по умолчанию присутствует в обьявлении интерфейса
    //Абсолютно все методы интерфейса косвенно(неявно и по умолчанию) и абстрактные и публичные
    //public abstract
    //Могут быть константы( public static final)
    public static final String color = "black";

     void print();

    // Начиная с JDK 8 доступны методы по умолчанию(имеющие реализацию)
    default void defaultMethod(){
        System.out.println("Default method");

    }

    // Начиная с JDK 8 доступны  static методы
    static void testStaticMethod(String str){
        System.out.println("Static method: " + str);
    }

    // Начиная с JDK 9 доступны private static и не статические методы
    //Переопределить в классе НЕВОЗМОЖНО!

}
