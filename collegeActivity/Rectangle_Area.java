package collegeActivity;

import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args) {
       double l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of a rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();

        double area=l*b;
        System.out.println("Area of a given rectangle is : "+area);
    }
}
