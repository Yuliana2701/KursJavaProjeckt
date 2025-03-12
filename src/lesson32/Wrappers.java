package lesson32;

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
        // .valueOf (преобразует явным образом примитив или строку в обьект обертки)
        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl: " + dbl);

        Boolean bool = Boolean.valueOf("true");
        System.out.println("bool: " + bool);

        //parseXXX() - преобразует строку в соответствующий примитив

        double dblP = Double.parseDouble("456");//возвращает примитив
        Double dblD = Double.valueOf("456");//возвращает ссылочный тип
        System.out.println(dblD + " | " + dblP);

        System.out.println(Integer.parseInt("123"));

        //toString -у всех оберток переопределен метод,который возвращает строковое представление числа
        //equals - равнивает два обьекта по значению

        Integer i1 = 127;
        Integer i2 = 256;
        System.out.println(i1 > i2);

        //compareTo- сравнивает текущий обьект с другим обьектом.Кто больше?
        //ип возвращаемого значения у него int
        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(127): " + i2.compareTo(i1));
        System.out.println("256.compareTo(256): " + i2.compareTo(i2));
        /*
        i1 > i2 -> положительное
        i1 < i2 -> отрицательное
        i1 = i2 -> 0
         */
        System.out.println("\n=======================================");

        //XXX.value- озвращает значение обьекта как примитивный тип
        Double d2 = 125.67; //автоупаковка
        d2 = Double.valueOf(125.67);//явная примитивная упаковка
        double dPrimitive = d2; //автораспаковка
        dPrimitive = d2.doubleValue(); // вная принудительная распаковка

        System.out.println("\n=======================================");

        /*
        Абстрактный класс Number.Все числовые обертки наследуются от абстрактного класса Number
        Byte, Short, Integer, Long, Float, Double.
        /*

         /*
         byteValue
         shortValue
         intValue
         longValue
         floatValue
         doubleValue
         */

        //

        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);
        System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());
        System.out.println("dWrapper.intValue(): " + dWrapper.intValue());




    }

}
