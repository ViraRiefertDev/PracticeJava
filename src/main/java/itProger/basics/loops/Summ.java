package itProger.basics.loops;

public class Summ {
    public static void main(String[] args) {
        int sum =0;
        int num = 5;
        while(num<=57) {
            if (num != 34 && num != 46 && num != 52) {
                sum += num;
            }
            num++;
        }

        System.out.println(sum);
        num = 5;
        sum = 0;
        do {
            if (num != 34 && num != 46 && num != 52) {
                sum += num;
            }
            num++;
        }while(num<=57);
        System.out.println(sum);
    }

}
