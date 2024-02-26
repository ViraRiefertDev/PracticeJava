package itProger.basics.massiv;
/*
Напишите программу для определения массива A из 10 целых элементов.
Попросите пользователя заполнить массив цифрами. Вывести массив на экран в одну строку
 */
import java.util.Arrays;
import java.util.Scanner;
public class CreatinAndOutputtingAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Заполните массив цифрами.");
        for(int i=0; i<A.length; i++){
            System.out.print("Введите " + i + " элемент массива:");
            A[i]= scanner.nextInt();
        }
        System.out.println("Введенный массив: " + Arrays.toString(A));
        //Второй вариант вывода массива
        for(int i=0; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}
