package ItProger.Basics.Loops;

public class NumberSumm {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1;i<100; i++){
            if(i%4==0){
                sum += i;
            }
        }
        System.out.println("Сумма чисел = " + sum);
    }
}