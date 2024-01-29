package String;
/* Java Program to reverse any String . */

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter your string : ");
        str=sc.nextLine();

        String reverse="";
        int len=str.length();
        for(int i=len-1;i>=1;i--){
            // System.out.println(str);
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of my string is : ");

        System.out.println(reverse);
    }
}
