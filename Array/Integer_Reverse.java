package Array;

import java.util.Scanner;

public class Integer_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter your no. : ");
        n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int digit = n%10;
            rev = (rev*10)+digit;
            n/=10;
        }

        System.out.println("Reverse of my no. is  : "+rev);
    }
}
