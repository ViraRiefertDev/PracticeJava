package itProger.basics.javaCollections.arrayListJava;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Коллекции в Java представляют из себя наборы связанных между собой классов для реализации структур данных
Коллекции позоволяют нам создавать чтото в духе массивов данных, но только с большим колличеством функций и возможностей.
Существует множество классов для реализации коллекций.
Существует основной интерфейс Collection а также интерфейс Map (Он позволяет создавать массивы ключ-значение)
 */
public class ItProgerLection {
    public static void main(String[] args) {
        //Коллекции в Java
        //ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(30);
        numbers.add(5);
        numbers.add(50);
        numbers.add(0,30);

       // System.out.println(numbers.size());

        System.out.println(numbers.get(2));
        numbers.remove(1);
        //numbers.clear();

        for(int el : numbers){
            System.out.println(el);
        }



        //LinkedList
        LinkedList<Float> digits = new LinkedList<>();
        digits.add(3.4f);
        digits.add(25.354f);
        digits.add(3.468484f);

        for(Float el: digits){
            System.out.println(el);
        }


        /*
        ArrayList vs. LinkedList
        Разница заключается в том как сами эти классы были созданы
        LinkedList привязвывает элементы этого массива друг к другу
        Если потребуется часто в какой то коллекции удалять элементы или вставлять элементы, потому что принцип
        переинедксирования в LinkedList выполнен быстрее чем в ArrayList
         */


    }
}
