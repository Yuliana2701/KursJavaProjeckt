package homework12;

public class Task2 { public static void main(String[] args) {

        /*
        Task 2
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте).

Вычислите среднюю температуру за неделю и выведите ее на печать.
P.S. - правильно выберите типы данных

         */


    double mondayTemp = 5.0;
    double tuesdayTemp = - 1.0;
    double wednesdayTemp = 2.0;
    double thursdayTemp = - 4.0;
    double fridayTemp = 6.0;
    double saturdayTemp = 7.0;
    double sundayTemp = 3.0;

    double summaTemp = mondayTemp + tuesdayTemp + wednesdayTemp + thursdayTemp + fridayTemp + saturdayTemp + sundayTemp;
    double averageTemp = summaTemp / 7;



    System.out.println("Средняя температура за неделю: " + averageTemp);
}
}

