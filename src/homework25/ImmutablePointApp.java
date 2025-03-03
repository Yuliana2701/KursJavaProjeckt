package homework25;

public class ImmutablePointApp {
    public static void main(String[] args){
        ImmutablePoint point = new ImmutablePoint(10,5);
        System.out.println("getX: " + point.getX());
        System.out.println("getY:" + point.getY());

       // System.out.println(point.setX(3)); выдает ошибку,
        // так как final переменные можно задать только один раз при обьявлении или в конструкторе
       // System.out.println(point.setY(7));
    }


}
