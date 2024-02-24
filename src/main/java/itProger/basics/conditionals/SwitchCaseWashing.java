package itProger.basics.conditionals;

import java.util.Scanner;

public class SwitchCaseWashing {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int washingMode = scanner.nextInt();
        // 0 - Выкл
        // 1 - хлопок
        // 2 - синтетика
        // 3 - шелк
        // 4 - шерсть
        //...

        //Если бы мы не указали break, у нас бы выполнился весь код под каждым кейсом ниже
        switch (washingMode) {
            case 0:
                System.out.println("Стиральная машина выключается");
                break;
            case 1:
                System.out.println("Включаестя режим стрики хлопка");
                break;
            case 2:
                System.out.println("Включаестя режим стрики синтетики");
                break;
            case 3:
                System.out.println("Включаестя режим стрики шелка");
                break;
            case 4:
                System.out.println("Включаестя режим стрики шерсти");
                break;
            default:
                System.out.println("Выбран неверный режим стирки");
                break;
        }
    }
}
