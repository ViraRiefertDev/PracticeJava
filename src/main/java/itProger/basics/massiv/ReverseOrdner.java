package itProger.basics.massiv;
/*
Поменяйте элементы массива местами, изменив зеркально их порядок.
Пример:
int[] x = {9, 25, 78, 23, -43, 4};
После сортировки:
 { 4, -43, 23, 78, 25, 9 }
Важно: сделайте все самостоятельно. Не используйте встроенные функции языка Java.
 */
public class ReverseOrdner {
    public static void main(String[] args) {
        int[] array = new int[]{9, 25, 78, 23, -43, 4};
        int[] reverseOrdner = new int[array.length];
        int j = 0;
        for(int i=array.length-1;i>=0;i--){
            reverseOrdner[j]=array[i];
            j++;
        }
        for(int i=0;i<reverseOrdner.length;i++){
            System.out.print(reverseOrdner[i] + " ");
        }

    }
}
