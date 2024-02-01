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
        char ch=sc.nextCharacter();
        int count =0;
        if(ch==str){
            count++;
        }
        System.out.println("Occurance of your character : "+count);

    }
}
