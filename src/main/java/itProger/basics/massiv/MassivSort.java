package itProger.basics.massiv;
/*
Создайте программу, которая будет просить пользователя ввести размер массива,
а также все значения элементов для массива.
После ввода данных массив будет сортироваться в порядке возрастания элементов.
В конце программы выведите получившийся массив на экран.
Важно: не используйте встроенные функции в Java для сортировки массива.
 */
import java.util.Scanner;

public class MassivSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        if (length <= 0) {
            System.out.println("Неверный размер");
        } else {
            System.out.println("Введите значения элементов массива: ");
            for (int i = 0; i < length; i++) {
                System.out.print("Введите " + i + " элемент массива: ");
                array[i] = scanner.nextInt();
            }
            boolean flag = false;
            while (!flag) {
                flag = true;
                for (int i = 1; i < length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        flag = false;
                    }
                }
            }
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
