package itProger.basics.methods;
/*
Напишите функцию, которая будет принимать массив данных и выводить в консоль минимальный по модулю элемент массива.
Массив данных:
{9, 342, 2, -1, 34, -35, -12, -3, 4, -2, 23}
 */
public class MinModule {
    public static void main(String[] args) {

        int[] array = new int[]{9,342,2,-13,34,-35,-12,-3,4,-2,-1};
        int min = minMod(array);
        System.out.println(min);

    }

    public static int minMod(int[] array){
        int min = Math.abs(array[0]);
        for(int i = 1; i<array.length;i++){
            if(Math.abs(min)>Math.abs(array[i])){
                min = array[i];
            }
        }
        return min;
    }
}
