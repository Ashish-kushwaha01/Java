package String;

import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        str= sc.nextLine();

        int len = str.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
        
        rev=rev+ str.charAt(i); 
        
    }
    System.out.print("Reverse of my string is : " +rev);
}
}