package itProger.basics.massiv;
/*
Создайте массив и выведите в консоль минимальный и максимальный элементы в этом массиве.
Массив данных:
{24, -63, 67, -12, 88, 94, -28, 82, 0, 53}
 */
public class MinAndMax {
    public static void main(String[] args) {
        int[] array = new int[]{24, -63, 67, -12, 88, 94, -28, 82, 0, 53};
        int min =array[0];
        int max = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
