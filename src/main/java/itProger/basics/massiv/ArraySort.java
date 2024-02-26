package itProger.basics.massiv;
/*
Создайте массив чисел и примените функцию сортировки к этому массиву.
Отсортированный массив выведите в консоль в формате строки.
 */
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {24, 63, 67, 12, 88, 94, 28, 82, 61, 53};

        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
