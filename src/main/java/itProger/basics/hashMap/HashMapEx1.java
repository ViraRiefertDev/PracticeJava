package itProger.basics.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");


        //Ключ и значение могут иметь значение null, но ключ может иметь такое значение только одно
        map1.put(null, "Sergej Petrov");
        map1.put(35656, null);
        //putIfAbsent добавь этот элемент в нашу коллекцию, если такого элемента в ней еще нет
        map1.putIfAbsent(1000, "Oleg Ivanov");


        //вывод значения по ключу
        System.out.println(map1.get(1000));//Zaur Tregulov
        //если укажем значение, которого нет, то выведится null
        System.out.println(map1.get(1001));//null

        //Удаление элемента по ключу
        map1.remove(15879);

        //containsValue
        //Будет возвращать true, если значение содержится в нашем HashMap
        System.out.println(map1.containsValue("Oleg Ivanov"));
        //containsKey
        //Проверяет есть ли в нашем HashMap определенный ключ, возвращает boolean
        System.out.println(map1.containsKey(1000));

        //keySet()
        //возвращает множество ключей которые есть в сете
        System.out.println(map1.keySet());

        //values()
        //возвращает множество значений HashMap, причем в таком же порядке, в каком возвращались ключи в keySet
        System.out.println(map1.values());

        //entrySet



        System.out.println(map1);
    }
}
