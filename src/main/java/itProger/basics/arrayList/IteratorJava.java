package itProger.basics.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class IteratorJava {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {64,42,73,41,32,53,16,24,57,42,74,55,36};

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,array);

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));

        }

        //Итератор специальный класс который служит для итерации по элементам коллекции
        //Который будет одинаково эффективен что для ArrayList что для LinkedList
        //Тоесть это универсальный способ итерации по элементам коллекции
        //A итератор служит абстракцией, который управляет этой итерацией

        //Пока в итераторе есть следующий элемент мы вызываем iterator.next() и получаем
        // следующий элемент а итератор перемещается на следующий элемент
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*
        Итератор это интерфейс, который имеет 2 основных метода
        boolean hasNext(); - говорит о том есть ли следующий элемент;
        и метод next(); - который выдает следующий элемент;
        */

        //for-each является сокращенной записью итератора
        for(Integer integer:list){
            System.out.println(integer);
        }



    }
}
