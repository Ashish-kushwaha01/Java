import java.util.Scanner;

public class Remainder {
    /* Write a program to print remainder when first no. is divide by second no.  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.print("Enter your first no. : ");
        a=sc.nextInt();
        System.out.print("Enter your second no. : ");
        b=sc.nextInt();

        double remainder = a%b;
        System.out.print("Remainder is : "+remainder);
    }
}
