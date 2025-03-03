package lesson25;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args){
        System.out.println("static counter: " + StatikBlockDemo.counter);
        System.out.println("static array: " + Arrays.toString(StatikBlockDemo.colors));

       StatikBlockDemo demo = new StatikBlockDemo();
      //  System.out.println(demo.toString());
     //   System.out.println("static array: " + Arrays.toString(StatikBlockDemo.colors));
        StatikBlockDemo demo2 = new StatikBlockDemo();
        StatikBlockDemo demo3 = new StatikBlockDemo("Title");



    }
}
