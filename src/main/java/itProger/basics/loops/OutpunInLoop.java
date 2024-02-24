package itProger.basics.loops;
/*
Выведите столбец чисел от 25 до 29 с пропуском числа 27.
Реализуйте программу при помощи циклов for и do while.
 */
public class OutpunInLoop {
    public static void main(String[] args) {
        System.out.println("------Variant 1 with for----------");
        for(int i = 25; i<=29;i++){
            if(i!=27){
                System.out.println(i);
            }
        }
        System.out.println("--------Variant 2 with do_while--------");
        int i = 25;
        do {
            if(i!=27){
                System.out.println(i);
            }
            i++;
        }while(i<=29);

    }
}
