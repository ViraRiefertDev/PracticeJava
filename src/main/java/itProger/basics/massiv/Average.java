package itProger.basics.massiv;
import java.util.Scanner;
/*
Найти среднее арифметическое элементов одномерного массива.
Элементы массива, которые больше среднего арифметического, вывести на экран.
Массив:
{5, 8, 18, 34, 3, 56, 43, 27, 4, 23}
 */
public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[]{5, 8, 18, 34, 3, 56, 43, 27, 4, 23};
        for (int j : array) {
            sum += j;
        }
        int average = sum/array.length;
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов массива = " + average);
        System.out.println("Элементы массива, которые больше среднего арифметического: ");
        for(int i=0;i<array.length;i++){
            if(array[i]>average){
                System.out.print(array[i] + " ");
            }
        }
    }
}
