package Java;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a ,b ,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first no. : ");
        a=s.nextInt();
        System.out.println("Enter your second no. : ");
        b=s.nextInt();
// Swapping 
        c=a;
        a=b;
        b=c;
// displaying 
        System.out.println( "After swapping : ");
        System.out.println("My first no is : "+a);
        System.out.println("My second no is : "+b);


    }
    
}
