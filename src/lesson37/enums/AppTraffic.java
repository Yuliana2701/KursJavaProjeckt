package lesson37.enums;

public class AppTraffic {
    public static void main(String[] args) {
        Colors color = Colors.RED;
        System.out.println("color = " + color);

        Colors[] colors = Colors.values();//получаю массив всех значений enum
        for (Colors current : Colors.values()){
            System.out.println(current);
        }
        //Возвращает константу enum по указанному имени(строки)
        Colors red = Colors.valueOf("RED");

        //enum безопасно сравнивать ==(не обязательно сравнивать equals)
        System.out.println(color == Colors.RED);

        //у каждой константы есть порядковый номер (начиная с 0)
        System.out.println("color.ordinal(): " + color.ordinal());
       TrafficLight trafficLight = new TrafficLight("SN-001", "Berlin",
               Colors.YELLOW);
        System.out.println(trafficLight);
    }
}
