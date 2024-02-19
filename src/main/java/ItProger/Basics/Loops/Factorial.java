package ItProger.Basics.Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        long factorial=1;
        for(int i = 2; i<=number; i++){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
