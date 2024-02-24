package itProger.basics.informationOutput;
import java.util.Scanner;
public class ValueCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int x2 = scanner.nextInt();
        System.out.println(x1 + " + " + x2 + " = " + (x1+x2));
        System.out.println(x1 + " - " + x2 + " = " + (x1-x2));
        System.out.println(x1 + " * " + x2 + " = " + (x1*x2));
        System.out.println(x1 + " / " + x2 + " = " + (x1/x2));
        System.out.println(x1 + " % " + x2 + " = " + (x1%x2));


    }
}
