package itProger.basics.conditionals;
import java.util.Scanner;
public class StringComparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите две строки");
        System.out.print("Первая строка: ");
        String line1 = scan.nextLine();
        System.out.print("Вторая строка: ");
        String line2 = scan.nextLine();
        boolean result = line1.length()>line2.length();
        if(result)
            System.out.println(line2 + " меньше чем " + line1);
        else if(!result)
            System.out.println(line1 + " меньше чем " + line2);
        else
            System.out.println(line1 + " равна по длинне " + line2);




    }
}
