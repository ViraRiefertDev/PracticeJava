package ItProger.Basics.Loops;

public class OutputWithCondition {
    public static void main(String[] args) {
        for(int i=-7; i<=12; i+=3){
            if(i!=-1 && i!=5 && i!=11){
                System.out.println(i);
            }
        }
        System.out.println("------------------------------------------------------------------");
        int i = -7;
        while(i<=12){
            if(i!=-1 && i!=5 && i!=11) {
                System.out.println(i);
            }
            i+=3;
        }
    }
}
