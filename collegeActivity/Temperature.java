package collegeActivity;

import java.util.Scanner;

/* Change celcius into fahrenheit and kelvin . */
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
            float celcius,farn,kelvin,Rheumer;
            System.out.println("Enter your temperature in Celcius : ");
            celcius=sc.nextFloat();

            farn =( 9*celcius/5)+32;
            kelvin= celcius+273;
            Rheumer=4*celcius/5;
            System.out.println("Your temperature in fahranheit is : " +farn+" and in kelvin is : "+kelvin +"and in Rheumer is : "+Rheumer);
        
        }
}
