package itProger.basics.conditionals;
import java.util.Scanner;
public class SwitchCaseSeasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Нельзя использовать тип long
        int month = scanner.nextInt();
        //---------------Variant 1---------------------------------------
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверные данные");
                break;
        }
        //------------ Variant 2 ----------------------------
        String seasons;
       seasons = switch (month){
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9,10,11 -> "Осень";
           default -> "Неверные данные";
        };
        System.out.println(seasons);
    }
}
