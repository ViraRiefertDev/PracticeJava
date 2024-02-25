package itProger.basics.methods;
import java.util.Scanner;
public class Overloading2 {
    /*
    Перегрузка функций
    Создайте три функции с одним именем:
    1) Функция принимает два слова и выводит их через пробел;
    2) Функция принимает два целых числа и выводит каждое число с новой строки;
    3) Функция принимает одно число и одно булевое выражение и выводить их через пробел.
     */
    public static void main(String[] args) {
        output("Java", "top");
        output(4,5);
        output(34,true);
    }

    public static void output(String word1, String word2){
        System.out.println(word1 + " " + word2);
    }
    public static void output(int numb1, int numb2){
        System.out.println(numb1);
        System.out.println(numb2);
    }

    public static void output (int numb, boolean logic){
        System.out.println(numb + " " + logic);
    }
}
