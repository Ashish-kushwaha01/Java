package Project;
/* Calculate distance ,when initial velocity ,time and acceleration is given ; */

import java.util.Scanner;

public class calculateDistance {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your initial velocity : ");
    int u=sc.nextInt();

    System.out.print("Enter your time : ");
    int t=sc.nextInt();


    System.out.print("Enter your acceleration : ");
    int a=sc.nextInt();



    int distance = (u*t)+(a*t*t)/2;

    System.out.println("Your total distance is : "+distance);
}    
    
}
