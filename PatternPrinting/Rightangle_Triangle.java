package PatternPrinting;

import java.util.Scanner;

/* Java Program to Print Right Triangle Star Pattern . */
public class Rightangle_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter how many lines do you want to print  :");
        n=sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println("");
            }
    }
}
