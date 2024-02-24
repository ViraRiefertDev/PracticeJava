package itProger.basics.massiv;
//Создайте массив, после чего найдите сумму отрицательных элементов массива
public class NumbersSumm {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,5,-1,-5,0,-8};
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]<0){
                sum += array[i];
            }
        }
        if(sum == 0){
            System.out.println("Нет цифр меньше 0");
        }
        else{
            System.out.println("Сумма отрицательных элементов массива =" + sum);
        }
    }
}
