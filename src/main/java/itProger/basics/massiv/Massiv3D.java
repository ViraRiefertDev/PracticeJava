package itProger.basics.massiv;
/*
Создайте трехмерный массив состоящий из чисел.
Установите значение 23 для одного из элементов. Выведите этот элемент на экран.
 */
public class Massiv3D {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        array[1][2][1] = 23;

        System.out.println(array[1][2][1]);
    }
}
