/* Java program to convert Fahrenheit to Celsius . */

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        float f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature in Fahrenheit : ");
        f=sc.nextInt();
        float temp = 5*(f-32)/9;
        System.out.println("Your temperature in Celcius is : "+temp);
    }
    
}
