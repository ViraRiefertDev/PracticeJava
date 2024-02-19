package ItProger.Basics.InformationOutput;
import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну сторону прямоугольника");
        double x1 = scanner.nextInt();
        System.out.println("Введите вторую сторону прямоугольника");
        double x2 = scanner.nextInt();
        System.out.println("Площадь треугольника: " + (x1*x2));
        System.out.println("Периметр треугольника: " + (x1+x2)*2);
    }
}
