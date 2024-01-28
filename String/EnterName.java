package String;

import java.util.Scanner;

/* Java Program to Print Simple String entered by user . */
public class EnterName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name ;
        System.out.println("Enter your name : ");
        name =  sc.nextLine();

        System.out.println("Your name is : "+name);
    }
    
}
