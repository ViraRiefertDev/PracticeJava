package ItProger.Basics.Loops;

public class LoopWhile {
    public static void main(String[] args) {
        String str = "";
        for(int i=13; i>0;i--){
            if(i != 10){
                str += i;
                if(i != 1){
                    str += ", ";
                }
            }

        }
        System.out.println(str);
    }
}
