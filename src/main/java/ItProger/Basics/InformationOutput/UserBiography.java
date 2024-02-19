package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class UserBiography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Сколько Вам лет, " + name + "?");
        int age = scanner.nextInt();
        System.out.println(name + " " + surname + " Вам " + age + " лет!");
    }

}
