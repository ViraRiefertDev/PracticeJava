package itProger.basics.massiv;
/*
Создайте массив используя цикл do while. Каждый элемент, а также размерность массива должен вводить пользователь с клавиатуры.
 */
import java.util.Scanner;
public class ArrayFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int i = 0;
        do {
            System.out.println("Введите " + (i+1) + " элемент массива");
            array[i] = scanner.nextInt();
            i++;
        }while(i<length);
    }
}
