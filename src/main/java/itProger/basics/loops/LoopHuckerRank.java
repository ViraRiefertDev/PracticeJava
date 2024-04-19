package itProger.basics.loops;

import java.util.Scanner;

public class LoopHuckerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int s = a;
            for(int j=0;j<=n-1; j++){
                s += (int)Math.pow(2,(double) (j))*b;
                System.out.print(s + " ");
            }
            System.out.println("");

        }
    }
}
