package itProger.basics.loops;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int even = 0;
        int odd = 0;
        while(number>0){
            if(number%2==0){
                even++;
            }
            else{
                odd++;
            }
            number /=10;
        }
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
    }
}
