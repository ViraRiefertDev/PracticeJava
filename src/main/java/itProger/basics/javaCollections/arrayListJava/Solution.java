package itProger.basics.javaCollections.arrayListJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        for(int i = 0; i<n; i++){
            ArrayList<Integer> digits = new ArrayList<>();
            int d = scanner.nextInt();
            for(int j=0; j<d;j++){
                digits.add(scanner.nextInt());
            }
            listOfLists.add(digits);
        }
//        System.out.println("---------------------------------------");
//        for(ArrayList<Integer> list : listOfLists){
//            System.out.println(list);
//        }
//        System.out.println("------------------------------------");
        n = scanner.nextInt();
        for(int i=0; i<n;i++){
            int xLine = scanner.nextInt();
            int yLine = scanner.nextInt();
//            System.out.println(listOfLists.get(xLine-1).get(yLine-1));
            //System.out.println(listOfLists.get(xLine-1).size());
            if((yLine-1)<listOfLists.get(xLine-1).size()){
                System.out.println(listOfLists.get(xLine-1).get(yLine-1));
            }
            else{
                System.out.println("ERROR!");
            }
        }

    }
}
