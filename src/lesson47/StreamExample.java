package lesson47;
/*
Stream API - это мощный инструмент,позволяющий обрабатывать наборы данных в декларативном стиле.
Основная идея: преобразование последовательности элементов через набор операций.
1.Stream (поток данных) - представляет последовательность элементов.Поток дает возможность
поочередно получать элементы для обработки.Стримы могут быть созданы из различных источников
(элементы коллекции,массивы,файлы,консоль  и т.д.)


Pipeline-последовательность операций,выполняемых на потоке.
1.Промежуточные операции/ методы( Intermediate) - это операции,которые преобразуют поток в другой поток,
возвращают другой поток.Их может быть БОЛЬШЕ ЧЕМ ОДНА.

2.Терминальные операции/ методы - это операции,которые ЗАПУСКАЮТ обработку потока и ЗАКРЫВАЮТ его.
Терминальный метод может быть ТОЛЬКО ОДИН.После выполнения терминальной операции поток
 перестает быть доступным для дальнейшей обработки.

 Ленивые вычисления
 Stream не выполняют промежуточные операции,пока на потоке не будет вызван терминальный метод
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    /*
    Промежуточные методы (Все методы возвращают поток) :
    Stream<T> filter(Predicate<T> predicate) - оставляет  в потоке только те элементы для которых predicate
     вернет true/оставляет элементы удовлетворяющие условию, или фильтрует(отбрасывает)
     элементы не удовлетворяющие условию.

     Stream<R>map(Function<T, R> action)- преобразует элементы потока с
      использованием заданной функции в другой тип данных

      Stream<T> peek(Consumer<T> action) - ыполняет действие для каждого элемента потока и как правило
      Действие не изменяющая элемент.



    sorted()-ортирует поток в естественном порядке
    sorted(Comparator<T>comparator)-ортирует элементы потока с использованием компоратора.

    distinct- удаляет дубликаты из потока

    --------------------

    Терминальные методы:
    R collect(Collector<T, A, R> collector -преобразует элементы потока в разные виды коллекций или
    другие структуры данных.

    void forEach(Consumer<T> action)- ыполняет заданное действие для каждого элемента потока
     */
    public static void main(String[] args) {
        //task1();
       // task2();
       // task3();
       // task4();
        //task5();
        //task6();
        //task7();
        //task8();
       // task8_1();
        //task9();
        //task10();

    }

    private static void task10() {
        //удалить дубликаты(повторяющиеся значения) из списка
        List<Integer>integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("==================================\n");
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4= new Cat("Panda", 4, "black");

        List<Cat>cats = Arrays.asList(cat, cat1,cat2,cat3,cat4);
        cats.forEach(System.out::println);

        System.out.println("================filter==================\n");

        cats.stream()
                .distinct()
                .forEach(System.out::println);



    }

    private static void task9() {
        // создание стрима из Map

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("map: " + map);
    }
    private static void task8_1() {
        List<Cat> cats = new ArrayList<>(getListCats());
        cats.add(null);
        System.out.println(cats);
    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2,new Cat(null, 10, "red"), cat3};
        //Получить список кошек,имя которых длиннее 4 символов

        //Arrays.stream(cats) - создает поток из элементов массива
        List<Cat>longCats = Arrays.stream(cats)
                .filter(c -> c != null)//оставить в потоке только не null
              //  .filter(c-> Objects.nonNull(c))
                .filter(Objects :: nonNull)
                .filter(c -> Objects.nonNull(c.getName()))//проверка какого-то поля на null
                .filter(c ->c.getName().length() >4)
                .collect(Collectors.toList());

        /*
        Objects.nonNull(null) вернет true,если параметр не null
        Objects.isNull(null) вернет true,если параметр  null

         */

        System.out.println(longCats);


    }

    private static void task7() {
        List<Cat>cats = getListCats();

        //Вывести на экран имена котов,чей вес меньше 5
        //Вывести на экран котов,оставшихся в потоке,после фильтрации

        /*
        peek-промежуточный метод,используется в основно для отладки.Не закрывает поток
        forEach терминальный метод,для выполнения действия с каждым элементом потока,
        закрывает поток.
         */
        Stream<String>catStream = cats.stream()
                .peek(System.out::println)
                .filter(cat -> cat.getWeight() <5 )
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());


        catStream.forEach(name -> System.out.println("Terminal: " + name));

    }

    private static void task6() {
        List<Cat>cats = getListCats();

        //получить список имен кошек у которых имена короче 5 символов
        /*
        Класический подход.Методы фильтрации в потоке должны выполняться как можно раньше
        Эффективность

         */
        List<String>names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat :: getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        /*
        Читаемость и понимание кода
         */
        System.out.println("=============================\n");
        List<String>names2 = cats.stream()
                .map(Cat :: getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);



    }

    private static void task5() {
        List<Cat>cats = getListCats();
        /*
        Получить список имен кошек,чей вес больше 4кг+
        Создать поток кошек
        Оставить в потоке кошек,чей вес больше 4
        Изменить тип потока - Cat -> String(name)
        Собрать это в список
         */
        List<String>names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("names: " + names);


    }

    private static void task4() {
        List<Cat>cats = getListCats();

        //получить список имен всех кошек

        Stream<String>namesString = cats.stream()
                .map(cat -> cat.getName());


        List<String>catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catNames:" + catNames);

        //изначальная коллекция(источник данных для потока) не изменяется
        System.out.println(cats);

     //   List<String>listNames = new ArrayList<>();
     //   for (Cat cat : cats){
      //      listNames.add(cat.getName());
      //  }

    }

    private static void task3() {
        List<Cat>cats = getListCats();
        //оставить котов с именем, длиннее 4 символов
        Stream<Cat>stream= cats.stream()
                .filter(c -> c.getName().length() > 4);

        //пока не запущен терминальный метод,промежуточные операции не выполняются

        List<Cat>longName = stream.collect(Collectors.toList());
        System.out.println("longName: " + longName);
    }

    private static List<Cat> getListCats(){
        return List.of(
             new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
                );
    }

    private static void task2() {
        List<Cat>cats = getListCats();

        //получить список кошек с весом больше 4кг
        Stream<Cat>catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        //вызвать терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        System.out.println("fatCats: " + fatCats);

        //Повторно использовать "закрытый"(закрытый - это поток на котором уже был вызван
        // терминальный метод) поток НЕЛЬЗЯ.
        // List<Cat>catList2 = catStream.sorted().collect(Collectors.toList());// будет ошибка(исключение)




    }

    private static void task1() {
        List<Integer>integers = List.of(-1, 12, 0, 5, 1, -15, 24, 99);
        //получить список,содержащий все положительные числа из исходного списка
        //список должен быть отсортирован в порядке возрастания

        List<Integer>result = new ArrayList<>();
        for (Integer num : integers){
            if (num > 0){
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        //У всех коллекций есть метод .Stream() создающий поток из элементов коллекций

       List<Integer> integerList = integers.stream()//создание потока из элементов коллекции List
                .filter(e-> e > 0)//фильтрация элементов потока
                .sorted()//сортировка элементов в естественном порядке
                .collect(Collectors.toList());//собирает элементы потока в List
        System.out.println("integerList: " + integerList);






    }
}
