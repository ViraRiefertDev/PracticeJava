package itProger.basics.loops;

public class OutputWithCondition {
    /*
    Создайте цикл от -7 до 12. Выводите в консоль лишь каждое третье число с пропуском чисел -1, 5 и 11.
    Реализуйте программу при помощи циклов for и do while
     */
    public static void main(String[] args) {
        for(int i=-7; i<=12; i+=3){
            if(i!=-1 && i!=5 && i!=11){
                System.out.println(i);
            }
        }
        System.out.println("------------------------------------------------------------------");
        int i = -7;
        do{
            if(i!=-1 && i!=5 && i!=11) {
                System.out.println(i);
            }
            i+=3;
        }while(i<=12);
    }
}
