package itProger.basics.conditionals;
import java.util.Scanner;
public class ProfitCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loses,profit;
        System.out.println("Введите прибыль: ");
        profit = scan.nextInt();
        System.out.println("Введите потери: ");
        loses = scan.nextInt();
        if(profit>loses)
            System.out.println("Ваша прибыль =" + (profit-loses));
        else if(profit<loses)
            System.out.println("Ваши убытки составили: "+(loses-profit));
        else
            System.out.println("Нет ни прибыли, ни убытков");
    }

}
