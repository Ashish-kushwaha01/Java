/* Java Program to find GCD (HCF) of Two Numbers . */

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first and second no. : ");
        a=sc.nextInt();
        b=sc.nextInt();
        // if(a<b){
            for(int i=b;i>1;i--){
                if(a/i==0 && b/i==0){
                    System.out.println(i);
                    break;
                }
            // }
        }
        // else{
            // for(int i=a;i>1;i--){
            //     if(a/i==0 && b/i==0){
            //         System.out.println(i);
            //         break;
            //     }
            // }
        // }
    }
}
