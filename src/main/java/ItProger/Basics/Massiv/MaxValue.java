package ItProger.Basics.Massiv;
//Создайте массив, после чего найдите наибольший элемент массива
public class MaxValue {
    public static void main(String[] args) {
        int[] array = new int[]{3,5,8,23,6,45,3,6,0};
        int max = array[0];
        for(int i=0; i< array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Max element: " + max);
    }
}
