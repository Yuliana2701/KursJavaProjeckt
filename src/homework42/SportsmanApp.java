package homework42;

import lesson42.Car;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmens = new Sportsman[5];
        sportsmens[0] = new Sportsman("Igor", 19, 3);
        sportsmens[1] = new Sportsman("Ivan", 18, 3);
        sportsmens[2] = new Sportsman("Oleg", 25, 2);
        sportsmens[3] = new Sportsman("Anna", 31, 1);
        sportsmens[4] = new Sportsman("Petr", 19, 4);


        Arrays.sort(sportsmens);
        System.out.println("Сортировка по name :");
        for (Sportsman sportsman : sportsmens) {
            System.out.println(sportsman);
        }
        System.out.println("===========================================\n");

        Arrays.sort(sportsmens, new SportsmanScoreComparator());
        System.out.println("\nСортировка по score :");
        for (Sportsman sportsman : sportsmens) {
            System.out.println(sportsman);
        }
        System.out.println("===========================================\n");

        // Сортировка с использованием анонимного класса Comparator (по возрасту)
        Arrays.sort(sportsmens, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("\nСортировка по age :");
        for (Sportsman sportsman : sportsmens) {
            System.out.println(sportsman);
        }


    }
}