package homework21;

public class Dog {

  String name;
  String color;
  int age;


  public Dog(String name, String color, int age){
    this.name = name;
    this.color = color;
    this.age = age;

  }
  public void info(){
    System.out.println("I am dog " + name + " my color is " + color + " my age is " + age);
  }
  public void old(){
    System.out.println("Я стала старше ");
    this.age++;
    changeColor();
}
public void changeColor(){
    if (age == 5){
      color = "Появляется седина";
      System.out.println("Мой цвет сейчас: " + color);


    }else if (age >= 8){
      color = "Седой";
      System.out.println("Мой цвет сейчас: " + color);


    }
}
}
