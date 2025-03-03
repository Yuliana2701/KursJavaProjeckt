package lesson25;
/*

 В Java  кокстанта переменная, изменить которую не может ни один обьект класса,в котором она находиться
 Такая переменная создается и инициализируется один раз для всех экземпляров класса.

В Java константой считается не та переменная,которую, которую нельзя изменить в рамках одного обьекта

Такая переменная создается и инициализируется один раз для всех экземпляров класса.

static - делает переменную единственной для всех экземпляров класса(единое значение)
+ final делает ее неизменной

 */
public class ConstantDemo {
    public static final double PI = 3.141519;//константa
    // константa,т.к. не возможно изменить значение строки, оно же состояние обьекта
    public static final String COUNTRY = "Germany";


    // не константа,т.к. значение в массиве можно изменить
    public static final String[] COLORS = {"blue", "red", "green"};
    // не является константой, так как состояние обьекта(значения в массиве) можно изменить
    public static final int[] ints = new int[5];

    public ConstantDemo(){
        COLORS[0] = "purple";
      //  COUNTRY = "USA"; - не могу изменить
        String newString = COUNTRY.toUpperCase();
    }

    public static double doublePiSqrt(){
        double result = 2 * PI * PI;
        return result;
    }
}
