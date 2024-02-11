package Exercise;

import java.util.Scanner;

/* Find factorial using Recursion . */
public class Factorial_Recursion {
    public static int Fact(int n){
        if(n==1 || n==0) return 1;
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter your no. : ");
        a=sc.nextInt();
        
        System.out.println("Factorial of "+a+" is : "+Fact(a));

    }
}
