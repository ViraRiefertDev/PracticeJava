package ItProger.Basics.InformationOutput;
import java.io.FilterOutputStream;
import java.util.Scanner;
public class CountingEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        int letter= 0;
        int space = 0;
        int digit = 0;
        int other = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i< str.length();i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                digit++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("Букв: " + letter);
        System.out.println("Цифр: " + digit);
        System.out.println("Пробелов: " + space);
        System.out.println("Других знаков: " + other);
    }
}
