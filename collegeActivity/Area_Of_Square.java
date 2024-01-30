package collegeActivity;

import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a;
        System.out.println("Enter what is the length of a side of your square : ");
        a=sc.nextFloat();

        float area=a*a;

        System.out.println("Area of your Square is : "+area);
    }
    
}
