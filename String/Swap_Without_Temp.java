package String;

import java.util.Scanner;

/* Java Program to Swap two strings without using temp variable . */
public class Swap_Without_Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter your first string : ");
        str1  = sc.nextLine(); 
        System.out.println("Enter your second string : ");
        str2  = sc.nextLine();

        str1=str2+str1;
                str2=str1.replace(str2,"");
                str1=str1.replace(str2,"");

                System.out.println(str1);
                System.out.println(str2);
}
}
