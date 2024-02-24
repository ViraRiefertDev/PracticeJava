package itProger.basics.loops;

import java.util.Scanner;
public class EndlessCycle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number;
        while(true){
            number = scanner.nextInt();
            if(number==0){
                System.out.println("Пропуск итерации");
                continue;
            }
            else if(number==1){
                break;
            }
                System.out.println("Итерация завершена");

        }
    }
}
