package String;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter your string : ");
        
            str=sc.nextLine();
        int len=str.length();
        System.out.println("Leng(th of my string is  : "+len);

        System.out.println("Which character do you want to search : ");
        String ch=sc.toString();

    }
}
