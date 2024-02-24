package itProger.basics.loops;
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
public class SquaresOfNumbers {
    public static void main(String[] args) {
        for(int i = 10; i<=20;i++){
            System.out.println(i + " * " + i + " = " + i*i);
        }
    }
}
