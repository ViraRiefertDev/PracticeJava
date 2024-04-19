package itProger.basics.string;
import java.util.Scanner;
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String result = s1;
            for(int j = 1;j<(15-s1.length());j++){
                result += " ";
            }
            if(x<10){
                result += "00";
            }
            else if(x<100){
                result += "0";
            }
            result +=x;
            System.out.print(result);
        }
        System.out.println("================================");


    }
}
