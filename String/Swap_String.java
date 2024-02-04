package String;

import java.util.Scanner;

// Swap two string without using third variable;
public class Swap_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter your first string : ");
        s1=sc.nextLine();
        int len=s1.length();
        
        System.out.println("Enter your second string : ");
        s2=sc.nextLine();

            s1= s1.concat(s2);
            s2=s1.substring(0, len);
            s1=s1.substring(len, s1.length());
// displaying
            System.out.println("First string is : "+s1);
            System.out.println("Second string is : "+s2);

    }
}
