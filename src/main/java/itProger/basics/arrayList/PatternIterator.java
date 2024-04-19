package itProger.basics.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PatternIterator {
    public static void main(String[] args) {
        int[] mas = new int[] {1,2,32,2233,1,0};
        for(int a:mas){
            System.out.println(a);
        }
        System.out.println("-------------------------------");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C#");
        strings.add("Python");
        strings.add("C++");
        strings.add("Ruby");

        for(String str:strings){
            System.out.print(str + ", ");
        }
        System.out.println("\n------------------------");

        for(Iterator<String> iterator = strings.iterator(); iterator.hasNext();){
            String tmp = iterator.next();
            System.out.print(tmp + ", ");
        }
        System.out.println("\n------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++){
            numbers.add(new Random().nextInt(50));
            System.out.print(numbers.get(i) + ", ");
        }

        //С помощью итератора будем удалять значения, которые >10
        for(Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();){
            if(iterator.next()>10){
                iterator.remove();

            }
        }

        System.out.println("\nРазмер списка: " + numbers.size());
        for(Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();){
            System.out.print(iterator.next() + ", ");
        }
    }
}
