import java.util.Scanner;

public class Volume_Sphere {
    // Find the Volume of a Sphere of a given Radius . 
    public static void main(String[] args) {
        double r ;
        double Pi = 3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of your Sphere : ");
        r=sc.nextInt();

        double Area = 4*Pi*r*r*r/3;
        System.out.println("Area of your Sphere is : "+Area);
    }
}
