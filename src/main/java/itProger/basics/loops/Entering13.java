package itProger.basics.loops;
import java.util.Scanner;
/*
Создайте константу со значением 13.
Попросите пользователя ввести число 13 с клавиатуры. До тех пор, пока он будет вводить другие числа вы будете просить
ввести его именно это число.
После ввода числа 13 выведите надпись: «Ура, вы это сделали!».
 */
public class Entering13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = 13;
        int inputNumber;
        do {
            System.out.println("Введите число 13!");
            inputNumber = scanner.nextInt();
            if(inputNumber==13){
                System.out.println("Ура, вы это сделали!");
                break;
            }
        }while (true);
    }
}
