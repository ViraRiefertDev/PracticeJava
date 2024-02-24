package itProger.basics.loops;

public class LoopOut {
    public static void main(String[] args) {
        for (int i = 25; i<=29;i++){
            if(i!=27){
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------------------");
        int i = 25;
        do {
            if(i!=27) {
                System.out.println(i);
            }
            i++;
        }while (i<=29);

    }
}
