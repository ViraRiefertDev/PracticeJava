package itProger.basics.informationOutput;
import java.util.Scanner;
public class WorkWithVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println(name + " " + surname + ", Вам " + age + " лет");
    }


}
