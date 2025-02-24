package homework12;

public class Task1 { public static void main(String[] args) {
        /*
        Task 1
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в остаток при операции деления?

         */


    int var1 = 0;
    int var2 = 1;
    int var3 = 2;
    int var4 = 3;

    int summa;
    summa = var1 +var2+ var3 + var4;
    int result = summa / 4;
    System.out.println("result = " + result );

    int result2;
    result2 = summa % 4;
    System.out.println("Остаток от деления = " + result2);



}
}

