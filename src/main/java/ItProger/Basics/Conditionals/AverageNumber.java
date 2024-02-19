package ItProger.Basics.Conditionals;
import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2, number3;

        System.out.println("Введите 3 произвольных числа");
        System.out.print("Первое число: ");
        number1 = scanner.nextInt();
        System.out.println("Второе число: ");
        number2 = scanner.nextInt();
        System.out.println("Третье число: ");
        number3 = scanner.nextInt();
        if((number1 == number2) || (number1 == number3) || (number2 == number3))
            System.out.println("Oшибка!");
        else if(number1>number2 && number1<number3 ||number1<number2 && number1> number3)
            System.out.println(number1 + " Среднее число");

        else if(number2>number1 && number2<number3 ||number2<number1 && number2>number3)
            System.out.println(number2 + " Среднее число");
        else
            System.out.println(number3 + " Среднее число");
    }
}
