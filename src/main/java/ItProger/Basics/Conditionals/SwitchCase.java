package ItProger.Basics.Conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x) {
            case 3:
                System.out.println("Три");
                break;
            case 7:
                System.out.println("Cемь");
                break;
            default:
                System.out.println("Что-то другое");
                break;
        }

    }
}
