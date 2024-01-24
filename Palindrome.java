/* Java Program to find given number is Palindrome or Not . */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n;
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your no. : ");
    n=sc.nextInt();
    int num=n;
    int rev =0;
    while (n!=0) {
        int digit = n%10;
        rev = (rev*10) + digit;
        n/=10;
    }
    System.out.println(rev);
    if(num==rev){
        System.out.println("My no. is Palindrome ");
    }
    else{
        System.out.println("My no. is not Palindrome ");
    }
    }
    
    
}
