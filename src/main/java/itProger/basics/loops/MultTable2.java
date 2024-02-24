package itProger.basics.loops;
/*
Выведите на экран таблицу умножения числа. Сделайте таблицу через цикл for,
где число будет умножаться от 1 до 10 включительно.
 */
import java.util.Scanner;
public class MultTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while(!scanner.hasNextInt()){
            System.out.println("Введите число!");
            scanner.next();
        }
        int number = scanner.nextInt();
        for(int i = 1; i<=10; i++){
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }

}
