package itProger.basics.methods;
import java.util.Scanner;
public class ComparisonOfNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int number1=scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Число " + number1 + " " + comparison(number1,number2) + " " + number2);
    }

    public static char comparison(int a, int b){
        if(a<b){
            return '<';
        }
        else if(a>b){
            return '>';
        }
        else{
            return '=';
        }
    }
}
