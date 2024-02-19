package ItProger.Basics.Conditionals;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа ");
        System.out.print("Первое число: ");
        double a = scan.nextDouble();
        System.out.print("Второе число: ");
        double b = scan.nextDouble();
        System.out.print("Введите арифметическое действие: ");
        char action = scan.next().charAt(0);
        if(action=='/' && b==0 ){
            System.out.println("На ноль делить нельзя!");
        }
        else {
            switch (action) {
                case '+':
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case '-':
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case '*':
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case '/':
                    System.out.println(a + "/" + b + "=" + (a / b));
                    break;
                default:
                    System.out.println("Вы ввели чтото не то!");
            }
        }
    }
}

