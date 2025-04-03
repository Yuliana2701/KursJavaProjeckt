package lesson48;
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

import lesson47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

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

    limit(long maxSize)-ограничивает колличество элементов потока.В потоке может быть не больше
    maxSize элементов.

    skip(long n)-ропускает первые n элементов потока
    Stream<T> mapToObj(Function() mapper)-преобразование примитивного типа данных в
    ссылочный при помощи заданной функции

 boxed() - преобразует потока примитивов (IntStream и т.п.) в поток соответствующих оберток (Stream<Integer>)

    mapToInt() - преобразует поток Stream<Integer> в поток примитивов IntStream


    --------------------

    Терминальные методы:
    R collect(Collector<T, A, R> collector -преобразует элементы потока в разные виды коллекций или
    другие структуры данных.

    void forEach(Consumer<T> action)- ыполняет заданное действие для каждого элемента потока

    Optional<T>max(Comparator<T>comparator)-возвращает элемент с макс.значением,(самый правый) элемент
    Optional<T>min(Comparator<T>comparator)-возвращает элемент с мин.значением,(самый левый )элемент

    long count()-возвращает колличество элементов в потоке

    Optional<T>findFirst()-получить первый элемент потока
    Optional<T>findAny()-получить случайный элемент потока

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
        //task11();
        //task12();
        //task13();
       // task14();
       // task15();
        task16();



    }


    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Преобразовать массив примитивов в список (коллекцию), используя Stream API

        // Stream<int> - не бывает. IntStream, DoubleStream... - бывают потоки примитивов
        List<Integer> integers =  Arrays.stream(ints)
//                .mapToObj( i -> Integer.valueOf(i))
//                .mapToObj(Integer::valueOf)
                // работает автоупаковка int -> Integer
//                .mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("integers: " + integers);

        // Получить из коллекции Integer - массив примитивов
        int[] intArray = integers.stream()
                // автораспаковка
                .mapToInt(i -> i)
                // хочет поток примитивов
                .toArray();

        System.out.println("массив: " + Arrays.toString(intArray));

    }

    private static void task15() {
        List<Integer>integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);
        //получить первый (самый левый) элемент потока
        //альтернативный способ получения минимума

        Optional<Integer> first = integers.stream()
                .sorted()
//                .findFirst(); // получить первый элемент потока
                .findAny(); // получить случайный элемент потока

        int min = first.get();

        System.out.println("min = " + min);

    }

    private static void task14() {
        List<Integer>integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);
        //получить список,состоящий из 3х самых маленьких чисел в списке

       List<Integer>smallList = integers.stream()
               .sorted()
               .limit(3)
               .collect(Collectors.toList());

        System.out.println(smallList);

        //получить список чисел,отбросив 2 самых маленьких

        List<Integer>list = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(list);




    }

    private static void task13() {
        List<Integer>integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);

        //посчитать колличество четных чисел в списке используя Stream API
        long count = integers.stream()
                .filter(n-> n %2 ==0)
                .count();
        System.out.println("count: " + count);


    }

    private static void task12() {
        List<Cat>cats = getListCats();
        //найти самое длинное имя кота,из списка котов

        /*
        Стрим котов преобразовать в стрим имен
        при помощи метода мах сравнить имена по длинне
         */

     //   Stream<String>maxName = cats.stream()
     //           .filter(Objects::nonNull)
      //          .map(Cat::getName)
       //         .filter(Objects::nonNull)
       //         .max(Comparator.comparingInt(String::length));

      //  System.out.println(maxName);


    }

    private static void task11() {
        List<Integer>integers = List.of(5,4,13,56,24,-10,-5,0,45,-25);

        //найти максимальное число из списка
        Optional<Integer>max = integers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("max: " + max);
        System.out.println("max: " + max.orElse(null));

        //найти самое маленькое число в потоке,которое больше 100

        Optional<Integer>minValue = integers.stream()
                .filter(n-> n > 100 )
                .min(Integer::compareTo);
        System.out.println("minValue: " + minValue);
        System.out.println("minValue: " + minValue.orElse(null));

    }

    private static void task10() {
        //удалить дубликаты(повторяющиеся значения) из списка
        List<Integer>integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("==================================\n");
        lesson47.Cat cat = new lesson47.Cat("Bear", 5, "braun");
        lesson47.Cat cat1 = new lesson47.Cat("Python", 7, "green");
        lesson47.Cat cat2 = new lesson47.Cat("Tiger", 3, "yellow");
        lesson47.Cat cat3 = new lesson47.Cat("Panda", 4, "black");
        lesson47.Cat cat4= new lesson47.Cat("Panda", 4, "black");

        List<lesson47.Cat>cats = Arrays.asList(cat, cat1,cat2,cat3,cat4);
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
        List<lesson47.Cat> cats = new ArrayList<>(getListCats());
        cats.add(null);
        System.out.println(cats);
    }

    private static void task8() {
        lesson47.Cat cat = new lesson47.Cat("Bear", 5, "braun");
        lesson47.Cat cat1 = new lesson47.Cat("Python", 7, "green");
        lesson47.Cat cat2 = new lesson47.Cat("Tiger", 3, "yellow");
        lesson47.Cat cat3 = new lesson47.Cat("Panda", 4, "black");

        lesson47.Cat[] cats = {cat, cat1, null, cat2,new lesson47.Cat(null, 10, "red"), cat3};
        //Получить список кошек,имя которых длиннее 4 символов

        //Arrays.stream(cats) - создает поток из элементов массива
        List<lesson47.Cat>longCats = Arrays.stream(cats)
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
        List<lesson47.Cat>cats = getListCats();

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
        List<lesson47.Cat>cats = getListCats();

        //получить список имен кошек у которых имена короче 5 символов
        /*
        Класический подход.Методы фильтрации в потоке должны выполняться как можно раньше
        Эффективность

         */
        List<String>names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(lesson47.Cat:: getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        /*
        Читаемость и понимание кода
         */
        System.out.println("=============================\n");
        List<String>names2 = cats.stream()
                .map(lesson47.Cat:: getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(names2);



    }

    private static void task5() {
        List<lesson47.Cat>cats = getListCats();
        /*
        Получить список имен кошек,чей вес больше 4кг+
        Создать поток кошек
        Оставить в потоке кошек,чей вес больше 4
        Изменить тип потока - Cat -> String(name)
        Собрать это в список
         */
        List<String>names = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(lesson47.Cat::getName)
                .collect(Collectors.toList());
        System.out.println("names: " + names);


    }

    private static void task4() {
        List<lesson47.Cat>cats = getListCats();

        //получить список имен всех кошек

        Stream<String>namesString = cats.stream()
                .map(cat -> cat.getName());


        List<String>catNames = cats.stream()
                .map(lesson47.Cat::getName)
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
        List<lesson47.Cat>cats = getListCats();
        //оставить котов с именем, длиннее 4 символов
        Stream<lesson47.Cat>stream= cats.stream()
                .filter(c -> c.getName().length() > 4);

        //пока не запущен терминальный метод,промежуточные операции не выполняются

        List<lesson47.Cat>longName = stream.collect(Collectors.toList());
        System.out.println("longName: " + longName);
    }

    private static List<lesson47.Cat> getListCats(){
        return List.of(
             new lesson47.Cat("Bear", 5, "braun"),
                new lesson47.Cat("Python", 7, "green"),
                new lesson47.Cat("Tiger", 3, "yellow"),
                new lesson47.Cat("Panda", 4, "black")
                );
    }

    private static void task2() {
        List<lesson47.Cat>cats = getListCats();

        //получить список кошек с весом больше 4кг
        Stream<lesson47.Cat>catStream = cats.stream()
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
