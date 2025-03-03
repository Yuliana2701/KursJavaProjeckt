package lesson25;

//  ключевое слово final.Оно может применятся к классам,
//  членам классов(полям,методам) переменным, в том числе и к аргументам методов
public class FinalDemo {
// Для примитивных типов данных , помеченых как final
 // после инициализации (присвоения первого значения) изменить значение в переменной нельзя   .
    private final int capacity;

    //Ссылочный тип данных. Нельзя изменить значение переменной(привязать новый обьект)
    //Я могу изменять состояние обьекта,который привязан
    private final int[] ints = new  int[5];// [0, 0, 0, 0, 0,]

    private int notFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        //ельзя поменять значение final переменной
        // this.capacity++;

        //Нельзя присвоить ссылку на другой обьект или null
       // this.ints = null;
       // this.ints = new  int[2];

        // Но можно изменить состояние обьекта
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }
    //Параметры метода тоже можно пометить как final
    //Внетри метода невозможно изменить значения переменной
    public void finalArguments(int x,int[] array){
        // нельзя изменить x
      //  x ++;

        // не могу присвоить ссылку на новый обьект
       // array = new int[10];

        // Могу изменять состояние объекта
        array[0] = x;
        array[1] = 1000;

    }
    //Сеттеры для финальных полей не  генерируются
    public void setCapacity(int capacity){
      // this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
