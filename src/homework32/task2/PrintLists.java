package homework32.task2;
/*
Task 2. * Опционально
        Обобщенный статический метод “Печать двух списков”
        Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList<U>,
        и выводит элементы обоих списков.

        Требования:

        Метод должен быть обобщенным по двум типам T и U.
        Элементы списков могут быть разных типов.
        Пример использования:

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
*/
import homework31.lists.MyArrayList;
import homework31.lists.MyList;

public class PrintLists {
    public static <T, U> void printToLists(MyList<T> list1, MyList<U> list2) {


        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }


    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printToLists(names, scores);
    }

}