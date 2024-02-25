package itProger.basics.methods;
/*
// Есть число 782123
// Функция выведет в консоль следующее:
782123
82123
2123
123
23
3
 */

public class CountAllNumbers {
    public static void main(String[] args) {
        int number = 782123;
        counting(number);
    }

    public static void counting (int number){
        String numberStr = String.valueOf(number).trim();
        for(int i = numberStr.length()-1; i>=0;i--){
            System.out.println(number);
            number = number%((int)Math.pow(10,i));
        }
    }
}
