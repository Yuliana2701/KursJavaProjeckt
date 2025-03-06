package lesson28.staticPolimorfizm;

public class TestToString {
    private String title;
    public TestToString(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass: " + title;
    }

    public static void main(String[] args) {
        TestToString test = new TestToString("test");

        //у всех классов есть родитель Object
        //Следует,что у обьекта любого класса есть метод полученный от Object
        //когда мы передаем ссылку на обьект,в место,где она должна быть приобразована в строку String
        //(sout  или конкатенация String + ссылка, у обьекта будет вызван метод + toString

        System.out.println(test);

        String result = "Hello, " + test;
        System.out.println(result);
    }
}
