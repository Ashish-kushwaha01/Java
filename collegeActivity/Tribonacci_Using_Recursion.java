package collegeActivity;

import java.util.Scanner;

public class Tribonacci_Using_Recursion {
    public static int Tribo(int n){
        int result=0;
        if(n==3)
        result=1;
        if(n==2)
        result=1;
        if(n==1)
        result =0;
        if(n>=4)
        result=Tribo(n-1)+Tribo(n-2)+Tribo(n-3);
        
        return result;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter your no. : ");
        n=sc.nextInt();

        System.out.println("Your Tribonacci series is : ");
        for(int i=1;i<=n;i++){
            System.out.print(Tribo(i)+"\s\s");
        }
    }
}
