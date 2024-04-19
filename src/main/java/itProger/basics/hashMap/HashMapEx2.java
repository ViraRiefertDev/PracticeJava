package itProger.basics.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> numbers = new HashMap<>();

        numbers.put(1,List.of("One", "ONE"));
        numbers.put(2, List.of("Two", "TWO"));
        numbers.put(3,null);

        for (Integer integer : numbers.keySet()) {
            System.out.println("key = " + integer);
        }

        Collection<List<String>> values = numbers.values();
        for(List<String> value : values){
            System.out.println("Value = " + value);
        }

        for (Map.Entry<Integer, List<String>> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
