package lesson45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {
        //Map<K, V>
        //Иногда, разные ключи могут привести к одному номеру ячейки(одинаковый хэш код
       // и/или номер ячейки

        Map<Integer, String> oldTable = new Hashtable<>();//устаревшая,медленная.
        // Не рекомендуется к использованию

        Map<String, String> phoneBook = new HashMap<>();
        //Добавить пару ключ-значение
        //V put(K key, V value)-возвращает старое значение,соответствующее ранее этому ключу,
        //если такого значения не было,вернет null
        System.out.println(phoneBook.put("Hanna", "+49-11111"));
        phoneBook.put("Max", "+49-22222");
        phoneBook.put("Jon", "+49-33333");


        System.out.println("phoneBook " + phoneBook);

        String oldValue = phoneBook.put("Jon", "+49-44444");
        System.out.println("oldValue" + oldValue);
        System.out.println("phoneBook " + phoneBook);

        //putAll - принимает карту(Map)и копирует все пары ключ-значения из этой карты
        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "49-5555");
        book2.put("Michael", "49-6666");
        phoneBook.putAll(book2);
        System.out.println("book2" + phoneBook);


        //boolean containsKey(Object key)- true
        //boolean containsValue(Object value)- true
        System.out.println(phoneBook.containsKey("Michael"));
        System.out.println(phoneBook.containsKey("123"));
        System.out.println(phoneBook.containsValue("49-44444"));
        System.out.println(phoneBook.containsValue("+49-44444"));




        System.out.println("====================GET=================");
        //Взятие значения по ключу
        //V get(K key)возвращает значение по ключу,если ключа нет вернет null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get (Hanna): " + value);

        System.out.println(phoneBook.get("KEY"));//вернет null

        //getOrDefault(Object key, V defaultValue)
        //Возвращает значение по ключу.Если ключа нет- вернет значение по умолчанию(второй параметр метода)
        String val2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println(val2);
        val2 = phoneBook.getOrDefault("KEY","DEFAULT" );
        System.out.println(val2);
        System.out.println(Objects.hashCode(null));

        System.out.println("=====================================");

        //Конструкторы
        // 16 корзин и коэфициент заполнения 0.75

        Map<Integer,String> construct = new HashMap<>();//Создается пустой список пар-ключ
        construct = new HashMap<>(30);//создается пустой словарь на 32 корзины.Коэфициент заполнения 0.75
        construct = new HashMap<>(32, 0.90f);
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1,"a");

        construct = new HashMap<>(otherMap);//скопирует все пары ключ-значения
        System.out.println("construct" + construct);

        //V remove (Object key) - удаляет пару ключ-значение.Возвращает старое значение null

        System.out.println("phoneBook " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));//Ключ есть.Удалит пару.Вернет старое значение
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));//Ключа нет.Вернет старое значение null

        //boolean remove(Object key, Object value)-удаляет пару ключ-значение,только если и ключ и значение
        // соответствуют текущим в мапе,вернет  true

        System.out.println(phoneBook.remove("Jon", "0000"));
        System.out.println(phoneBook.remove("Jon", "+49-44444"));

        System.out.println(phoneBook);

        // void clear()- очищает карту
        //int size() - возвращает кол-во элементов(пар ключ-значение)
        System.out.println(phoneBook.size());

        //boolean isEmpty()-вернет  true,если словарь пустой


    }
}
