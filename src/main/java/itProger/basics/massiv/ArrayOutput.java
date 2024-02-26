package itProger.basics.massiv;
/*
Выведите через цикл массив состоящий из чисел. Выводите не только значения элементов, но также индексы элементов.
 */
public class ArrayOutput {
    public static void main(String[] args) {
        int[] array = new int[]{-14,23,9,-4,12,-1};
        for(int i = 0; i<array.length;i++){
            System.out.println("Элемент под индексом " + i + " имеет значение: " + array[i]);
        }
    }
}
