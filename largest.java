/* Java Program to find Largest among three Numbers . */

import java.util.Scanner;

public class largest {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first no. : ");
    a=sc.nextInt();
    System.out.println("Enter your second no. : ");
    b=sc.nextInt();
    System.out.println("Enter your third no. : ");
    c=sc.nextInt();

    if(a>b && a>c)
    System.out.println("First No. is greater ");

    if(b>a && b>c)
    System.out.println("Second No. is greater ");

    if(c>a && c>b)
    System.out.println("Third No. is greater ");
}
    
}
