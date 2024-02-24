package itProger.basics.informationOutput;

public class WorkWithNumbers {
    public static void main(String[] args) {
        int days = 2642;
        int years = 2642/365;
        int weeks = (years%365)/7;
        int day = days-(years*365+weeks*7);
        System.out.println("Лет: " + years + ", недель: " + weeks + ", дней: " + day);
    }
}
