package lesson31;

public class Wrappers {
    //Классы обертки используются для представления примитивных типов как обьектов(как ссылочных)

    /*
   Byte - обертка byte
   Short - обертка short
   Integer - обертка int
   Long - обертка long
   Float - обертка float
   Double - обертка double
   Character - обертка char
   Boolean - обертка boolean

     */
    public static void main(String[] args) {
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);


        //Поддержка null
       // int x = null; примитив null не поддерживал
        maxValue = null;

        //Приведение типов.Автоупаковка и авторазпаковка
        Integer wrapperInt = 5;// Автоупаковка примитива int  в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // авторазпаковка.з типа Integer автоматически преобразовано в примитив int
        System.out.println(primitiveInt);

        System.out.println("\n======================================================");

        //Сравнение обьектов - следует использовать метод equals
        // -128....127 - Кеширование

        Integer a = 127;// Создан обьект с адресом памяти @2aaa2
        Integer b = 127;//бьект с таким значением уже есть,новый не создается -выдается ссылка на уже существующий @2aaa2.
        //Сравниваем значения записанные в переменных,(ссылки) тоесть адреса обьектов памяти
        System.out.println("a.equals(b)" + a.equals(b));// true

        Integer c = 128;//Создан обьект с адресом памяти @3ррр3
        Integer d = 128;//Создан обьект с адресом памяти @4ссс4. Не проверяется на наличие обьекта с таким значением
        System.out.println("128 == 128 " + (c == d));// false
        System.out.println("c.equals(d)" + c.equals(d));// true

        //Общие(схожие) методы,которыми обладают классы-обертки


    }

}
