package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class NumberToDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число c 4 цифрами");
        int number = scanner.nextInt();
        int n1,n2,n3,n4;
        n1=number/1000%10;
        n2 = number/100%10;
        n3 = number/10%10;
        n4 = number%10;
        System.out.println(n1 + ", " +n2 + ", " +n3 + ", " +n4);
    }
}
