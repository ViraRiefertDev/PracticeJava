package itProger.basics.methods;
import java.util.Scanner;
public class SimpleMethods {
    /*
    Создайте две функции. Первая будет выводить текст в консоль,
    вторая будет принимать параметр в виде текста и выводить его в консоль.
    Важно: обе функции должны иметь одинаковое имя.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = "Параметр в виде текста";
        textOutput();
        textOutput(text);
    }

    public static void textOutput(){
        System.out.println("Выводим какой то текст!");
    }

    public static void textOutput(String text){
        System.out.println(text);
    }
}
