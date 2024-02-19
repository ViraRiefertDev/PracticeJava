package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class FindingANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        //Первый вариант
        System.out.println(n + "" + (n*2));
        //Второй вариант
        int n2 = n*2;
        System.out.println(String.valueOf(n) + String.valueOf(n2));
    }
}
