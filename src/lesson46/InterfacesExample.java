package lesson46;
//Stream API.Функциональные интерфейсы Function, Predicate, Consumer,
// являются частью Java Lambda Expression введенных в Java 8
// Имплементации интерфейсов применяются,когда метод принимает интерфейс в качестве параметра

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {

        //Consumer<T> - выполняет операцию над обьектомтипа Т, не возвращая никакого результата
       // void accept(T t)
        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + "!!!");
            }
        };
        example = string -> System.out.println(string + "!!!");

        example.accept("Hello World");
        example.accept("Java");

        //Составной интерфейс

        Consumer<String> consumer1 = str -> System.out.println("1 " + str.length());
        Consumer<String> consumer2 = str -> System.out.println("2 " + str + "!");

        Consumer<String>resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");


        //Predicate <T> - проверка обьекта на соответствие условию(тестирование обьекта)
        //boolean test(T t)- основной(абстрактный) метод
        /*
        and()- логическое и
        or()-огическое или
        negate()- отрицание

         */

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isShort = string -> string.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println(result);
        System.out.println(isShort.test("JS"));

        List<Integer> list = new ArrayList<>(List.of(-1, 3, -4, 0, 34, -45, 11, 45, 10, -50, 12, 36, 4));

        //Список всех отрицательных чисел
        List<Integer>res = filterListByPredicate(list, i ->  i < 0);
        System.out.println(res);

        //Список всех нечетных чисел
        res = filterListByPredicate(list, val -> val % 2 != 0);
        System.out.println(res);

        //Список всех четных чисел,больше 5
        res = filterListByPredicate(list, i -> i > 5  && i % 2 == 0);
        System.out.println(res);


        System.out.println("===================================\n");
        Predicate<String> isLongString = string -> string.length() > 4;
        Predicate<String> isContainsJava = string -> string.contains("Java");

        Predicate<String> combinePredicate = isLongString.and(isContainsJava);
        Predicate<String> combinePredicate1 = isLongString.or(isContainsJava);

        String word = "Java";
        System.out.println(combinePredicate.test(word));
        System.out.println(combinePredicate1.test(word));

        Predicate<String> combine2 = isContainsJava.negate();
        System.out.println(combine2.test(word));

        System.out.println("=================Function==================\n");

        //Function<T, R> - производит операцию над обьектом Т,возвращает результат типа R
        //R apply(T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        integerFunction = string -> string.length();
        int lenght = integerFunction.apply("Hello World");
        System.out.println(lenght);

        //Function<String,String> toUpper = String::toUpperCase;
        Function<String,String> toUpper = string -> string.toUpperCase();
        System.out.println(toUpper.apply("Hello World"));



    }

    //Метод должен возвращать список обьектов,удовлетворяющих требованию/условию
    //прошедших проверку предикатов
    public static List<Integer>filterListByPredicate(List<Integer>integers,Predicate<Integer>predicate){
        List<Integer>result = new ArrayList<>();

        for (Integer value : integers){
            if (predicate.test(value)){
                result.add(value);
            }
        }
        return result;

    }
  //  public static List<Integer>listNegative(List<Integer>integers){

    }


