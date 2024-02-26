package itProger.basics.massiv;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
Создайте массив и программу, которая будет находить второй самый маленький элемент в массиве.
 */
public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {24, -63, 67, -12, 88, 94, -28, 82, 0, 53};
        //Выводим весь массив как строку
        System.out.println("Массив: " + Arrays.toString(arr));
        int min;
        int secondMin;
        if(arr[0]>arr[1]){
            min = arr[1];
            secondMin = arr[0];
        }
        else{
            min = arr[0];
            secondMin = arr[1];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i]< min){
                    secondMin = min;
                    min = arr[i];
            }
            else if(arr[i]<secondMin){
                secondMin = arr[i];
            }
        }
        System.out.println("Минимальный элемент= " + min);
        System.out.println("Второй минимальный элемент= " + secondMin);
    }

}
