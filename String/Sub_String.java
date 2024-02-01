package String;
import java.util.*;
import java.util.Scanner;

/* Java program to find and display all substrings in string . */
public class Sub_String {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String str,sub;
System.out.println("Enter your string : ");
str = sc.nextLine();
int len = str.length();

        System.out.println("Substring are : ");
        for(int i=0;i<len;i++){
            for(int j=1;j<len-i;j++){
                sub=str.substring(i,i+(j));
                System.out.println(sub);
        
            }
        }
 
    }
}
