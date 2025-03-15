package lesson33;

import homework31.lists.MyArrayList;
import homework31.lists.MyList;

import java.util.Iterator;

/*
Есть два интерфейса Iterable Iterator
1.Iterable - значает,что обьекты этого класса можно перебирать(итерироваться)
Один абстрактный метод: Iterator<T> iterator() - возвращает итератор для этого
набора элементов(коллекции)
2.Iterator - собственно итератор, который позволяет обходить коллекции
- boolean hasNext - есть ли следующий элемент
- T next()- возвращает следующий элемент
- void remove()- удаляет последний возвращенный элемент.Метод не обязателен для переопределения
*/
public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list  = new MyArrayList<>();
        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
            iterator.remove();// без переопределения выдает ошибку
        }
        //Цикл for-each
        //При переборе циклом for-each не рекомендуется изменять коллекцию(добавлять или удалять элемент)
        /*
        for(Тип переменной имяПеременной : коллекция){
        //ействие с переменной
       }
         */
        System.out.println("\n========================================");

        for (String strCurrent : list){
            System.out.println(strCurrent);
        }
        // Вывести в консоль все числа,которые есть в списке умноженные на 2.
        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        for (Integer value : integers){
                System.out.println(value * 2);
              //  if (value == 3) integers.remove(Integer.valueOf(3));- не рекомендуется так делать!!!

        }

        //Вывести все элементы массива циклом for-each
        int[] array = {10, 20, 30, 40, 50};

        for (int element : array ){
            System.out.println(element);
        }
    }


}
