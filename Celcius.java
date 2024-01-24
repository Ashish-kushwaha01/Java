import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        float c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature in Celcius : ");
        c=sc.nextInt();
        float temp = (9*c/5)+32;
        System.out.println("Your temperature in Celcius is : "+temp);
    }
}
