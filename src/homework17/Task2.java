package homework17;

public class Task2 {
    public static void main(String[] args) {
        /*

        Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
         */

        int[] array = {1, 4, 3, 6, 7};
        printArray(array);
        printArray(array, 2);
    }

    public static void printArray(int[] array) {
        System.out.println(" [ ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > array.length - 1 ? " " : " "));
        }
        System.out.println(" ] ");
    }

    public static void printArray(int[] array, int index) {
        System.out.println(" [ ");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + (i == index - 1 ? " " : " "));
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i] + (i == index ? " " : " "));
        }
        System.out.println(" ] ");
    }
}