package ItProger.Basics.Conditionals;
import java.util.Scanner;
public class DotAndCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x,y,r;
        System.out.println("Введите координату x: ");
        x = scan.nextDouble();
        System.out.println("Введите координату точки y");
        y = scan.nextDouble();
        System.out.println("Введите радиус круга: ");
        r = scan.nextDouble();

        boolean inCircle = (Math.pow(x,2)+Math.pow(y,2)<=Math.pow(r,2));
        if(inCircle)
            System.out.println("Данная точка принадлежит кругу!");
        else
            System.out.println("Данная точка НЕ принадлежит кругу!");



    }
}
