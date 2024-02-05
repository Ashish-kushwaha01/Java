/* Java program to find roots of quadratic equation in all cases . */

import java.util.Scanner;
import java.math.*;

public class Roots {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient of x^2 : ");
        a=sc.nextInt();

        System.out.println("Enter coefficient of x : ");
        b=sc.nextInt();

        System.out.println("Enter constant of my quadratic equation : ");
        c=sc.nextInt();

        int d = (b*b)-4*a*c;
       double s1 = -b + Math.sqrt(d);
      double s2= -b - Math.sqrt(d);
// Finding roots 
        System.out.println (" Root 1 :  "+s1/(2*a)  );
         System.out.println("Root 2 : " +s2/(2*a));
    }
}
