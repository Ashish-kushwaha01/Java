import java.util.Scanner;

public class Use_Pow {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   double a,b;
    System.out.println("Enter your first no.(a) and second no.(b) : ");
    a=sc.nextDouble();
    b= sc.nextDouble();

    double pow = Math.pow(a,b);
    System.out.println("a^b is : "+pow);
   } 
}
