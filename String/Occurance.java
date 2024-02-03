package String;
// Multiple occurence of a character.

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = "Ashish Kushwaha";
        int strlen = str.length();
        System.out.println("Length of my string is  : "+strlen);
        
        char ch;
        // System.out.println("Which charactr do you want to search ? : ");
        // ch=sc.next().charAt(0);

        int Now_Strlen= str.replace("s", "").length();
        int count = strlen - Now_Strlen;

        System.out.println("Total no. of given character in my string is : "+count);
    }
}
