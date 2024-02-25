package itProger.basics.methods;
import java.util.Scanner;
/*
Создайте функцию, которая будет возвращать правильное окончание количеству лет.
Например: при вводе числа 1 функция будет добавлять слово «год» (чтобы получилось 1 год),
при вводе 2 – 2 года, при вводе 5 – 5 лет и т. д.
 */
public class EndingOfWords {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите сколько Вам лет: ");
        checkValue();
        int age = scanner.nextInt();
        String ending =endings(age);
        System.out.println("Вам " + age +" "+ ending);
    }
    public static void checkValue(){
        while(!scanner.hasNextInt()){
            System.out.println("Введите число!");
            scanner.next();
        }
    }
    public static String endings(int age) {
        int lastDigit = age % 10;
        if (age >= 5 && age <= 20 || lastDigit >= 5 || lastDigit == 0) {
            return "лет";
        } else if (lastDigit >= 2) {
            return "года";
        } else {
            return "год";
        }
    }

}



