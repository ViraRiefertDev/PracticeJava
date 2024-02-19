package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class WeigthOnTheMoon {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите Ваш вес: ");
        double weight = scanner.nextDouble();
        System.out.println("Ваш вес на Луне = " + (weight*0.17));
    }
}
