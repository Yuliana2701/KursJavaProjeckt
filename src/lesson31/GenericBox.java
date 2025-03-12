package lesson31;
//Generice работают только с обьектами классов,тоесть только со ссылочными типами данных
//И соответственно не работают с примитивными типами данных

//Мы создаем универсальный класс и не указываем конкретный тип данных,с которым он работает
//Мы хотим определять тип данных при создании каждого обьекта
//<T> - параметр типа


public class GenericBox<T> {// символ заполнитель Т- от слова type, E- element, K, V- key, value.
    //<T> - означает,что вместо Т при создании обьекта будет подставлен конкретный тип данных
    private T value;// T -> String

    public GenericBox(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
