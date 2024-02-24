package itProger.basics.conditionals;
import java.util.Scanner;
public class TernorOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scan.nextInt();
        System.out.print("Введите второе число: ");
        double b = scan.nextInt();
        double result = b!=0 ? (a/b):(1);
        System.out.println("Деление двух чисел равно: " + result);
    }

}
