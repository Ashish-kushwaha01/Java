package String;
// Multiple occurence of a character.

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str ;
        System.out.println("Enter your string : ");
        str= sc.nextLine();
        int strlen = str.length();
        System.out.println("Length of my string is  : "+strlen);
        
        int count =0;
        char ch;
        System.out.println("Which charactr do you want to search ? : ");
        ch=sc.next().charAt(0);
       
       for(int j=0;j<str.length();j++){
         for(int i=65;i<=122;i++){
            if((int)ch==i){
                count++;
            }
            }
              continue;
        }
        System.out.println("Your given characte ("+ch+") is : "+count+" times");
       
    }
}
