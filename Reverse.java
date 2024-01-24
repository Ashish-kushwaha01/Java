/* Java Program to find Reverse Number using While Loop . */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. : ");
        n=sc.nextInt();

        System.out.println("Reverse of my no. is : ");
        while(n!=0){
            int digit = n%10;
            System.out.print(digit);
            n/=10;
        }
    }
    
}
