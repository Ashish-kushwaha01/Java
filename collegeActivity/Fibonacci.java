/*Java Program to display Fibonacci Series using While Loop. */
package collegeActivity;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter that how many no. do you want to print ? : ");
        n=sc.nextInt();
       int a=0,b=1,c;
       System.out.print(a+" "+b+"\s");
       for(int i=1;i<=n-2;i++){
        c=a+b;
        System.out.print(c+" \s");
        a=b;
        b=c;
       }
  
        

    }
}