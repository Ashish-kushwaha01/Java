package String;

import java.util.Scanner;

/* Java Program to Find Length of String using length() method . */
public class String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your string : ");
        str = sc.nextLine();
       
        int len;
        len = str.length();
        System.out.println("Length of my string is  : "+ len);
    }
}
