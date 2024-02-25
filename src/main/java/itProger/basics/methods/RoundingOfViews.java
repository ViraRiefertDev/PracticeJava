package itProger.basics.methods;
import java.util.Scanner;
/*
Создайте функцию, которая будет округлять четырехзначные числа,
заменяя все цифры, стоящие справа от разряда числа, буквой «К».
Число менее тысячи будет выводиться без изменений.
 */
public class RoundingOfViews {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(rounding(number));
    }
    public static String rounding (int number){
        String str ="";
        if(number>=1000){
            str = number/1000 + "." + number%1000/100 + "K";
        }
        else{
            str = String.valueOf(number);
        }
        return str;
    }
}
