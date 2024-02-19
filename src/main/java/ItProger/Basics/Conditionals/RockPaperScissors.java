package ItProger.Basics.Conditionals;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1;
        String player2;
        System.out.print("Ход первого игрока: ");
        player1 = scan.nextLine();
        System.out.print("Ход второго игрока: ");
        player2 = scan.nextLine();
        String result = game(player1,player2);
        System.out.println(result);
    }

    public static String game(String p1, String p2) {
        String option1 = "Бумага бьет камень.";
        String option2 = "Камень бьет ножницы.";
        String option3 = "Ножницы бьют бумагу.";
        String error = "Надо ввести rock paper scissors";

        if (p1.equals(p2)) {
            return "Ничья!";
        } else if (p1.equals("rock")) {
            if (p2.equals("paper"))
                return option1 + "\nИгрок 2 победил!";
            else if (p2.equals("scissors"))
                return option2 + "\nИгрок 1 победил!";
            else
                return error;
        } else if (p1.equals("paper")) {
            if (p2.equals("rock"))
                return option1 + "\nИгрок 1 победил!";
            else if (p2.equals("scissors"))
                return option3 + "\nИгрок 2 победил!";
            else
                return error;
        } else if (p1.equals("scissors")) {
            if (p2.equals("paper"))
                return option3 + "\nИгрок 1 победил!";
            else if (p2.equals("rock"))
                return option2 + "\nИгрок 2 победил!";
            else
                return error;
        }
        else
            return error;
        }
    }



