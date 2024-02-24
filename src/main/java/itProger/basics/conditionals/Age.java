package itProger.basics.conditionals;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Введите Ваш возраст");
        age = scan.nextInt();
        if(age>18)
            System.out.println("Вам уже все можно");
        else if(age==18)
            System.out.println("Ура, Вам 18 лет");
        else
            System.out.println("Вы еще слишком молоды");

    }
}
