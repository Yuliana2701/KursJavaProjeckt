package lesson25;

public class StatikBlockDemo {
     static int counter = 5;
     static String[] colors = new String[3];

     private String title;
     private int capacity = 10;// инициализация значения

     //Статический блок инициализации
     //В нем могут быть проинициализированы cтатические поля класса(присвоение начальных значений)
     // Вызывается ровно один раз в момент загрузки класса в JVM (до вызова конструктора))
     static {
          System.out.println("Static Block RUN");


          colors[0] = "red";
          colors[1] = "green";
          colors[2] = "yellow";
     }

     // Не статические блоки инициализации,
     // выполняются при каждом создании обьекта.
     // вызываются до конструктора.
     {
          System.out.println("NON-static block RUN!");
          if (counter == 0) {
               this.capacity = 50;
          }
          title = "Default";
     }
     // Конструктор
     public StatikBlockDemo() {
          System.out.println("Constructor RUN!");
//        if (counter == 0) {
//            this.capacity = 50;
//        }

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";
     }

     // Конструктор 2
     public StatikBlockDemo(String title){
          System.out.println("Constructor2 RUN!");
         if (counter == 0) {
               this.capacity = 50;
          }
          this.title = title;
     }


     public String toString() {
          return String.format("Title: %s, capacity: %d, static-counter: %d",
                  title, capacity, counter);


     }


}


