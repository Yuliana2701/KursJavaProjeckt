package lesson21;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //Создание обьекта класса Cat
        // 1.Физически в памяти создается обьект типа Cat
        // 2.Вызывается конструктор класса для инициализации свойств обьекта
        // (то-есть заполнения полей значения)

        /*
        При создании обьекта класса все его поля инициализируются каким-то значениями
        По умолчанию, если не задано другое поведение, поля инициализируются значениями по умолчанию
         для своего типа данных.
         Для числовых примитивов - 0/0.0
         boolean - false
         для всех ссылочных - (в том числе String) - null
         */
        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя :"  + catName);
        System.out.println("Возраст :" + cat.age);

        Cat cat1 = new Cat("Max");
        //Будет создан новый обьект класса Cat
        // Имя (строка) которая была передана в конструктор будет
        // присвоена свойству обьекта name класса
        System.out.println("cat1.name :" + cat1.name);
        System.out.println("cat1.color :" + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("\n====================================");



        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " + barsik.name);
        System.out.println("barsik.color : " + barsik.color);
        System.out.println("barsik.age : " + barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;
        catClone.whoAmI();


        barsik.age = 100;
        System.out.println("\nbarsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();


        System.out.println("\n====================================");



        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // ничто, ссылка не ссылается ни на какой обьект
        // если у переменной, значение которой null попытаться вызвать метод, получить свойства, то программа аварийно
        // завершится ошибкой, которая имеет название NullPointerException
        // У null нельзя вызвать метод, присврить, можно проверить
       // System.out.println(catClone.age);
       // catClone.age = 44;
      //  catClone.whoAmI();

        if (catClone != null){
            System.out.println(catClone.name);
            catClone.whoAmI();
        }else {
            System.out.println("В переменной храниться null");
        }
    }


}
