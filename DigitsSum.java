/* Java Program to Find Sum of Digits of given Number . */

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        int n;
        int sum =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. : ");
        n=sc.nextInt();
        while(n!=0){
            int digit=n%10; 
            sum+=digit;
            n/=10;
        }
        System.out.println("Sum of all digits of my numbers is : "+sum);
    }
    
}
