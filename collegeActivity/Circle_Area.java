package collegeActivity;

import java.util.Scanner;

public class Circle_Area {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double r;
    System.out.println("Enter radius of a circle  : ");
    r=sc.nextInt();
// double pi=3.14;
    double Area = (3.14)*r*r;

    System.out.println("Area of a given circle is : "+Area);
   } 
}
