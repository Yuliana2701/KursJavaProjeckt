package lesson21;

public class Cat {
    // характеристики/ состояние будущих обьектов
    String name; // поле класса
    String color;
    int age;
    /*
    КОНСТРУКТОР КЛАССА
    Конструктор класса - это специальный тип метода, который автоматически вызывается при создании
    нового обьекта. Основная задача конструктора - установить начальные свойства обьекта.
    Особенности конструктора:
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет возвращаемого значения. Даже Void не указывается
     (т.к. конструктор возвращает экземпляр класса (обьект))
     3. Конструктор вызывается автоматически при создании обьекта
     */
    // Перегрузка конструкторов

    //Конструктор по умолчанию
    public Cat(){
        // все поля принимают значени по умолчанию для своего типа данных

    }
    //Конструктор - это в первую очередь метод и я могу передать значения в тело метода
public Cat(String catName){
    name = catName;
}

public Cat(String catName, String color){
        name = catName;
        this.color = color;

        //Ключевое слово this используется внутри класса для ссылки на текущий обьект
    // Оно поможет при разрешении конфликтов имен полей класса и параметров методов / конструкторов



}
public Cat(String name, String color, int age){

       // ключевое слово может быть использовано для вызова других конструкторов класса
        this(name, color); //вызов другого конструктора класса. Должен быть первой строкой используемого
    // конструктора.
    // или для передачи текущего обьекта в качестве параметра метода(разберем попосже)
    // вызов конструктора, принимающего две String-и
    // сначала будет выполнен код соответствующего конструктора
       // this.name = name;
      //  this.color = color;
        this.age = age;
}

    //Поведение будущих обьектов
    public void sleep(){
        System.out.println("Я сплю! ");
    }
    public void sayMeow(){
        System.out.println("Meow!");
    }
    public void run(){
        System.out.println("Я бегу!");
    }
    public void whoAmI(){
        System.out.printf("Я котик: %s, возраст: %d, мой окрас %s\n", name, age, color);
    }
}

