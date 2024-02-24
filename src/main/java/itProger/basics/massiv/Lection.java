package itProger.basics.massiv;

public class Lection {
    public static void main(String[] args) {
//        //Массивы данных теория
//        int[] nums =new int[5]; // создали пустой массив, который состоит из 5 элементов
//        nums[0] = 45;
//        nums[1] = 32;
//        nums[2] = 1;
//        nums[3] = 9;
//        nums[4] = 3;
//        int res = nums[2] + nums[3];
//        System.out.println(res);
//
//        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
//        System.out.println(nums2[1]);
//
//        for(int i=0; i< nums2.length; i++){
//            System.out.println("Element: " + nums2[i]);
//        }
//        System.out.println("----------------------------------------");


//        //Пользователь устанавливает значения в массив
//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print("Введите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//        //Находим минимальный элемент
//        int min = arr[0];
//        for(int i=1; i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.print("Min element: " + min);
//        System.out.println("----------------------------------------");


        //Многомерные массивы данных
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {3, 8},
                {2,0}

        };
        nums[1][1] = 67;
        System.out.println(nums[1][1]);
        //Вывод одномерного массива
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}