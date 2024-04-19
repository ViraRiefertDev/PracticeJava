package itProger.basics.massiv;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for(int i=0;i<n;i++){
            myArray[i] = scanner.nextInt();
        }
        for(int i= 0;i<n; i++){
            System.out.println(myArray[i]);
        }
    }
}
