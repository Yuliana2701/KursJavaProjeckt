package lesson23;

public class Cat {
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    // геттеры и сетторы - это специальные публичные методы, дающие возможность
    //получать и изменять значения поля
    // геттер для поля age
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    // сеттеры - публичные методы
    /*
    20 (20 < 0 || 2 - 30 - false - !false - true
    !(age < 0 || age > 30) => !(age < 0) и !(age > 30)
    Если возраст  не меньше 0 и не больше 30, то делай код 1. Иначе делай код 2
     */

    public void setAge(int age) {
        if (!(age < 0 || age > 30)) {
            //Если age не подходит(изначальное условие выдает false),
            //которое мы инвентируем оператор ! в true
            this.age = age;
        }

        /*
         if (age < 0 || age > 30){
        //age  не подходит ( условие выдает true)
          }else {
        //age подходит. Условие выдает false
            this.age = age;
            * /
    }


        /*
            if (age < 0 || age > 30){
            // пусто.Возраст не подходит - ничего не делаю
            return;
        }
            this.age = age;


      */
    }

    public void setWeight(int weight) {
        // Имеем возможность проверить значение
        if (weight < 0) {
            //eсли входящее значение не устраивает - я могу установить значение по умолчанию
            this.weight = 0;
            System.out.println("Tekuschii ves kota: " + this.weight);
            return;// работа метода прекращается,дальнейшие проверки не проводятся

        }
        //В эту строку кода мы попадем с значением weight 0 или больше
        //Если вес НЕ больше не большем 50кг - то делай блок кода 1.Иначе делай код 2
        //-5 > 50 ? !false = true
       if (!(weight > 50)) {
            // код 1
            this.weight = weight;
            //иначе ничего не делаем = оставляем старое значение

        }
    }
    //Я не хочу давать возможность изменять имя коту после создания обьекта
    // поэтому в классе не пишу сеттер на имя
    /*
    public void setName(String name){

       if (name != null){
         this.name = name;
         }
     }
     */



    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod();// внутри кода класса, у меня есть доступ к приватным членам( в том числе методам)
    }

    private void testMethod() {
        System.out.println("Test!");
    }

    public String toString() {
        //      System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
        String result = String.format("Cat %s, age: %d, weight: %d\n", name, age, weight); //формирование строки
        return result;
    }
}
