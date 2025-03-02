package homework24;
/*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка++

Должна уметь прыгать и должна уметь тренироваться.++

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров++

Максимальная высота прыжка, которую может натренировать собака, не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера. Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).

Если да -> идем тренироваться -> берет барьер
 */
public class Dog {
  private String name;
   private int jumpHeght;
   private final int maxJumpHight;

    public Dog(String name, int jumpHeght) {
        this.name = name;
        this.jumpHeght = jumpHeght;
        this.maxJumpHight = jumpHeght * 2;
    }

    public void jump(){
        System.out.println("I can jump");
    }
    public void training(){
        System.out.println("I can training");
    }
    public String info() {
        String result = String.format("Dog: %s, jumpHeght: %d cm\n", name, jumpHeght);
        return result;
    }
    public static void main(String[] args){
        Dog myDog = new Dog("Rex",30);
        System.out.println(myDog.info());

        System.out.println("\n====================================");

        myDog.jump();
        myDog.training();

        System.out.println("\n====================================");

        myDog.train();
        myDog.train();
        myDog.jumpBarrier(40);
        myDog.train();
        myDog.jumpBarrier(50);




    }

    public void train() {
        if (jumpHeght + 10 <= maxJumpHight) {
            jumpHeght += 10;
            System.out.println( name + " Потренировался, теперь прыгает на " + jumpHeght + "cm");
        } else {
            jumpHeght = maxJumpHight;
            System.out.println(name   + " Достиг максимальной высоты прыжка " + jumpHeght + "cm");
        }

    }
    public void jumpBarrier(int barrierHight){
        if (jumpHeght >= barrierHight){
            System.out.println(name  + " перепрыгнул барьер высотой " + barrierHight + "cm");
        }else {
            System.out.println(name  + " не смог перепрыгнуть барьер высотой " + barrierHight + "cm" );



        }


    }

    public String getName() {
        return name;
    }

    public int getHightJump() {
        return jumpHeght;
    }

    public int getMaxJumpHight() {
        return maxJumpHight;
    }


}
