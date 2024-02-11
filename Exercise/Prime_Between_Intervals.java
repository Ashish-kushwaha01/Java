package Exercise;

import java.util.Scanner;

public class Prime_Between_Intervals {
    public static int Prime(int a){
        int flag=0;
    
        for(int j=2;j<=a/2;j++){
            if(a%j==0){
                flag=1;
                break;
            
        }
     }
    return flag;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a,b;
       System.out.println("Enter your interval (a and b) : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Prime no. between a and b is : ");
       for(int i=a;i<=b;i++){
        if(Prime(i)==0){
            System.out.print(i+" ");
        }
        
        
    }
}
}
