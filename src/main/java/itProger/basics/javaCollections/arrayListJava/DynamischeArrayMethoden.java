package itProger.basics.javaCollections.arrayListJava;

import java.util.ArrayList;

public class DynamischeArrayMethoden {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(34);
        digits.add(3);
        digits.add(88);
        digits.add(32);
        ArrayList<Integer>cloneDigits = (ArrayList<Integer>) digits.clone();
        cloneDigits.remove(cloneDigits.size()-2);
        cloneDigits.set(2,52);
        for(int el : cloneDigits){
            System.out.println(el);
        }
    }
}
