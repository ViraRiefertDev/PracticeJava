package itProger.basics.methods;

import java.util.Scanner;

public class PassingPara {
    /*
    Создайте функцию c тремя параметрами. Функция должна возвращать результат деление чисел.
    Дополнительно:
    проверка деления на ноль
    получите три числа от пользователя
    передайте числа в функцию
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        System.out.println("Результат деления чисел = " + devision(num1, num2, num3));
    }

    public static double devision(double a, double b, double c) {
        if (b != 0 && c != 0) {
            return a / b / c;
        } else {
            return 1;
        }
    }
}
