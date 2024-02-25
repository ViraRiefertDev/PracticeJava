package itProger.basics.methods;
/*
Создайте две функции с одинаковым названием. Первая функция должна
подсчитывать сумму трех произвольных чисел, вторая – двух.
 */
import java.util.Scanner;

public class Overloading {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfNumbers;
        int sum;

        do {
            System.out.println("Если хотите получить сумму двух чисел введите 2, если трёх - введите 3");
            checkValue();
            amountOfNumbers = scanner.nextInt();

        } while (amountOfNumbers != 2 && amountOfNumbers != 3);
        System.out.println("Введите первое число: ");
        checkValue();
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        checkValue();
        int number2 = scanner.nextInt();
        if (amountOfNumbers == 2) {
            sum = summa(number1, number2);
        } else {
            System.out.println("Введите третье число: ");
            checkValue();
            int number3 = scanner.nextInt();
            sum = summa(number1, number2, number3);
        }
        System.out.println("Сумма " + amountOfNumbers + " чисел = " + sum);
    }

    public static int summa(int a, int b) {
        return a + b;
    }

    public static int summa(int a, int b, int c) {
        return a + b + c;
    }

    public static void checkValue() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
    }
}
