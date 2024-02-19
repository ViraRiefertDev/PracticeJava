package ItProger.Basics.Loops;
import java.util.Scanner;
public class MultTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        for (int i = 1; i<=10;i++){
            System.out.println(n + " * " + i + " = " + (i*n));
        }
    }
}
