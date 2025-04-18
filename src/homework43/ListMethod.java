package homework43;
/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListMethod {

        public static void main(String[] args) {
        Collection<Integer> collectionA = new ArrayList<>();
        Collection<Integer> collectionB = new ArrayList<>();
        collectionA.addAll(List.of(10, 20, -10, 30, 20, 40, 50, 60));
        collectionB.addAll(List.of(20, 30, 40, 100, 80, 50, -10));

            collectionA.retainAll(collectionB);
            System.out.println(collectionA);
        }


    }


