package collegeActivity;

import java.util.Scanner;

public class Fibonacci_Using_Recursion {
    public static int Fibo(int n){
       int  result =0;
        if(n==2)
        // System.out.println(1);
        result=1;
        if(n==1)
        result=0;
        // System.out.println(0);
        if(n>=3)
        // System.out.println();
         result = Fibo(n-1)+ Fibo(n-2);
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter your no. : ");
        n=sc.nextInt();


        System.out.println("Your series is : ");
        for(int i=1;i<=n;i++){
            System.out.print(Fibo(i)+"\s\s");
            
        }
    }
    
}
