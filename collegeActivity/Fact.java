package collegeActivity;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. : ");
        n=sc.nextInt();
        
        int fact=1;
        if(n==0){
            System.out.print( "Factorial is : " +1 );
        }
        else{
        for(int i=n;i>=1;i--){
            fact*=i;
        }
         System.out.println("Factorial is : "+fact);
        
    }
            
       
    }
}