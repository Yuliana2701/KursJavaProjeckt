package Consultation_17;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {

        public static void main(String[] args) {
            Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора

            Comparator<Integer> comparator = (int1, int2) -> {
                boolean isFirstEven = int1 % 2 == 0;
                boolean isSecondEven = int2 % 2 == 0;
                // 1 / 0  == 0  1  -> - 1
                // 1 : 0 -> 1 - 0 > 1

                // Четные числа должны идти перед не четными
                // Т.е. при сравнение четного и нечетного, четное должно признаваться меньшим

                // числа одинаковые - сортировать в естественном порядке
                if (isFirstEven && !isSecondEven) { // первое чет, второе нечет -> я должен признать первое меньшим
                    return -1;
                } else if (!isFirstEven && isSecondEven) { // первое нечет, второе чет -> я должен признать второе большим
                    return 1;
                } else { // оба числа "одинаковые" - либо чет, либо нечет
                    return Integer.compare(int1, int2);
                }

//
//            if (int1 % 2 == int2 % 2) {
//                return int1 - int2;
//            }
//            return int1 % 2 - int2 % 2;
            };

            Arrays.sort(integers, comparator);
            System.out.println(Arrays.toString(integers));






//[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
        }
    }



