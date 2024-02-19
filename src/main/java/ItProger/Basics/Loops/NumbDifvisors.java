package ItProger.Basics.Loops;
import java.util.Scanner;
public class NumbDifvisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for(int i = 1; i<=number; i++){
            if(number%i==0){
                System.out.print(i + " ");
            }
        }
    }

}
