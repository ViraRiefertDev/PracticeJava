package itProger.basics.loops;

import java.util.Scanner;

/*
Создайте бесконечный цикл, в котором просите пользователя ввести число.
Создайте проверки:
    при вводе числа 0 выходите из цикла;
    при вводе числа 1 пропускайте одну итерацию;
 */
public class EndlessLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while(true){
            System.out.print("Введите число! ");
            userNumber = scanner.nextInt();
            if(userNumber == 0){
                break;
            }
            else if(userNumber ==1){
                continue;
            }
            System.out.println("Еще одна итерация подошла к концу");
        }
        System.out.println("Вы вышли из цикла");
    }
}
