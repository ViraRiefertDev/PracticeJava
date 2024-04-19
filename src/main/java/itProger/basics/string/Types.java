package itProger.basics.string;
import java.math.BigInteger;
import java.util.Scanner;
public class Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            String numberString = scanner.next().trim();
            if(numberString.length()>19){
                System.out.println(numberString + " can't be fitted anywhere.");
            }
            else {
                long number = Long.parseLong(numberString);
                if (number >= -128 && number < 128) {
                    System.out.println(number + " can be fitted in:");
                    System.out.println("*byte");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                } else if (number >= -32768 && number <= 32767) {
                    System.out.println(number + " can be fitted in:");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                } else if (number >= -2147483648L && number <= 21474833647L) {
                    System.out.println(number + " can be fitted in:");
                    System.out.println("*int");
                    System.out.println("*long");
                } else if (number >= -9223372036854775808L && number <= 9223372036854775807L) {
                    System.out.println(number + " can be fitted in:");
                    System.out.println("*long");
                }
            }

        }
    }
}

/*
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 */