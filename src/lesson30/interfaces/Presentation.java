package lesson30.interfaces;

public class Presentation implements ColorPrintAble  {
    String title;
    String author;
    String thema;

    public Presentation(String title, String author, String thema) {
        this.title = title;
        this.author = author;
        this.thema = thema;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентацию в цвете: автор %s, title %s, thema %s\n", author, title, thema);
    }

    @Override
    public void print(){
        System.out.printf("Печать чб презентации %s, автора %s\n", title, author);

    }
}
