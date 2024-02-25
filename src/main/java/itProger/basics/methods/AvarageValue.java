package itProger.basics.methods;
import java.util.Scanner;
/*
Создайте функцию, которая будет принимать значение трех
произвольных числовых параметров и производить расчет их
среднего арифметического.
 */
public class AvarageValue {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 3 числа.");
        System.out.print("Первое число: ");
        checkValue();
        double number1 = scanner.nextDouble();
        System.out.print("Второе число: ");
        checkValue();
        double number2 = scanner.nextDouble();
        System.out.print("Третье число ");
        checkValue();
        double number3 = scanner.nextDouble();
        double result = avarageValue(number1,number2,number3);
        System.out.println("Срединее арифметическое 3ёх чисел = " + result);
    }

    public static void checkValue(){
        while(!scanner.hasNextDouble()){
            System.out.println("Введите число через запятую!");
            scanner.next();
        }
    }

    public static double avarageValue(double numb1, double numb2, double numb3){
        return (numb1 + numb2 + numb3)/3;
    }
}
