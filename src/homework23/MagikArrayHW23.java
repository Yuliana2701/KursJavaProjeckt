package homework23;

import java.util.Arrays;


public class MagikArrayHW23 {
 private int[] array;
   private int cursor; // по умолчанию = 0

    // Методы, расширяющие функционал массива

    public MagikArrayHW23() {
        this.array = new int[10]; // [0, 0...0]
    }

    public MagikArrayHW23(int[] array) {

        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            // (int...numbers) может принять ссылку на массив int[]
            add(array);
        }
    }



    // 1.Добавление в массив одного элемента
  public void add(int value) {

        // Проверка! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место

        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    // 2.Динамическое расширение массива
   private void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор = " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // Shift + Alt + стрелки вверх / вниз | Mac: Shift + Opt + Стрелка

        // 1
        int[] newArray = new int[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    //4. Добавление в массив нескольких элементов
  public void add(int... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
//        System.out.println("Принял несколько int: " + numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("У каждого инта есть индекс, как в массиве: " + numbers[0]);

        // перебираю все значение. Для каждого вызываю метод add()
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }


    // 3.Возвращает строковое представление массива
    // [5, 20, 45]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    // 5.Текущее кол-во элементов в массиве
   public int size() {
        return cursor;
    }

    //6. Возвращает значение по индексу
   public int get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблей

        // Код, если индекс не корректный
        // Хорошего решения нет
        return -2_147_483_647;
        // Todo Поправить обработку некорректного индекса
    }

    // 7.Удалить элемент по индексу. Вернуть старое значение
   public int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значением из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов
                array[i] = array[i + 1];
            }

            cursor--;

            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            // Todo поправить возвращаемое значение
            return -2_147_483_647;
        }

    }

    //8. Поиск по значению.
    // {1, 100, 5, 24, 0, 5} -> indexOf(5) = 2; indexOf(50) = -1;
  public   int indexOf(int value) {
        // Перебираю все значимые элементы.
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если перебрал все элементы =- не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }

        // Сюда мы попадем, если ни одно значение в массиве не совпало
        return -1;
    }

    //10. Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
  public   int lastIndexOf(int value) {

        for (int i = cursor - 1; i >= 0 ; i--) {
            if (array[i] == value) return i;
        }

        return -1;

        /*
        int index = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали, обновляю переменную index
                index = i;
            }
        }
        return index;
         */

    }

    //8. Удаление элемента по значению
  public   boolean removeByValue(int value) {
               /*
        1. Есть ли элемент с  таким значением - indexOf
        2. Если элемента нет - ничего не пытаемся удалить - возвращаем false
        3. Если найден - удалить и затем вернуть true.
         */
        int index = indexOf(value);
        if (index < 0) return false;

        // В эту строку кода попадем, только при index = 0 или больше
        remove(index);
        return true;
    }

    //  // {1, 100, 5, 100, 24, 0, 100}
//    int[] findAllValues(int value) {
//       // {1, 3, 6}
//        return null;
//    }

    //12. Массив, состоящий из элементов магического массива
    public int[] toArray() {
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }


  public void test() {
        System.out.println(Arrays.toString(array));
    }

}
// [5, 20]

/*
1. Добавлять в массив элемент (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера внутреннего массива ++
3. Возвратить строковое представление массива (все элементы массива в одной строке) (какие элементы есть)++
4. Добавить в массив сразу несколько значений ++
5. Текущее кол-во элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удалить элемент по индексу (есть индекс - удалить элемент из массива). Возвращает старое значение ++
8. Удаление элемента по значению. Возвращал boolean. Если удалил - вернет true. Не нашел что удалять - false
9. Поиск по значению. Возвращать индекс первого вхождения элемента ++
10. Индекс последнего вхождения.++
11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива++
12. Написать метод, который вернет массив, состоящий из элементов магического массива++
 */
