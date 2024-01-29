package String;

import java.util.Scanner;

/* Java Program to Copy String into Another String . */
public class Copy_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String S1 ,S2;
    System.out.println("Enter your string : ");
    S1 = sc.nextLine();

    StringBuffer copyBuffer = new StringBuffer(S1);
    System.out.println("String 1 copied in the second string then String 2 is : ");

    
    System.out.println(copyBuffer);
    }

    
}
