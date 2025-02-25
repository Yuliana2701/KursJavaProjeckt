package lesson21;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

   public void info(){
        System.out.println("I am dog " + name + " my weight "+ weight);
    }

   public void  eat(){
        System.out.println("Я кушаю, ням-ням!");
       this.weight++; // увеличиваем вес на 1
    }

  public  void run(){
        /*
        1. проверить достаточен ли вес собачки, для выполнения пробежки,
        2.если вес мал,
        то собака долна покушать
        перед тренировкой
         */

      while (weight < 3){
          System.out.println("Сорян, я слишком худая и голодная, бежать не могу, надо поесть!!");
          System.out.println("Мой вес сейчас: " + weight);

          eat();


      }

        System.out.println("Я бегу!");
        weight -= 2; // уменьшаем вес на 2
      System.out.println("Вес после пробежки: " + weight);
      System.out.println("==================================\n");
    }


}
