package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class NumberAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int x2 = scanner.nextInt();
        int sum = x1 + x2;
        System.out.println("Сумма чисел равна - " + sum);
    }

}
