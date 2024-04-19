package itProger.basics.hashMap;

import java.util.HashMap;

public class AllCharacterCounter {
    public static void main(String[] args) {
       /*
        У нас есть строка и мы хотим посчитать сколько каких символов у нас хранится в этой строке
        */
        HashMap<Character,Integer> result = new HashMap<>();

        String input = "Hello World!";
        //Пройтись по строке получить каждый символ и добавить его в коллекцию
        //Если такого ключа нет, тоесть этот символ встретился нам впервые, то мы добавляем запись символ такой то,
        // мы его встретили один раз(впервые)
        // Если мы опять встречаем этот же символ, то мы должны заменить старое значение на новое(тоесть должны
        // получить старое значение, добавить к нему +1 и перезаписать)

        for(int i=0;i<input.length(); i++){
            Character ch = input.charAt(i);
            if(result.containsKey(ch)){
                int oldValue = result.get(ch);
                result.put(ch, oldValue+1);
            }
            else{
                result.put(ch, 1);
            }
        }
        System.out.println(result);


        //Напишем то же самое использую лямбду
        for(int i=0;i<input.length(); i++){
            Character ch = input.charAt(i);
        //метод merge он проверяет есть ли такой ключ, и если такого ключа нет он пишет значение
        // по умолчанию, Если такой ключ есть, он вызывает метод, который переписывает старое значение
        result.merge(ch,1, ((integer, integer2) -> integer + 1));
        }
        System.out.println(result);

    }
}
