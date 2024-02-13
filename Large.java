/* Java Program to find GCD (HCF) of Two Numbers . */

import java.util.Scanner;
class Large{

    
//   First Method .

public static int HCF(int a, int b){
    if(a!=b){
        if(a>b){
            a=a-b;
        }
        else {
            b=b-a;
        }
        return HCF(a, b);
    }
    return a;
}


// SECOND METHOD . 


// public static int GCD(int a,int b){
//     if(a<b && b%a==0)
//     return a;
//     if(b<a && a%b==0) return b;
//     while (b>0){
//         int temp=b;
//         b=b%a;
//         a=temp;
//     }
//     return b;
// }


// NEXT METHOD .

public static int GCD(int a, int b){
    int min=Math.min(a, b);
   for(int i=min;i>=1;i++){
    if(a%i==0 && b%i==0)
    min=i;
   }
   return min;
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a, b;
    System.out.println("Enter your first and second no. : ");
    a=sc.nextInt();
    b=sc.nextInt();

    System.out.println("HCF of "+a+" and "+b+" is : "+HCF(a, b));
    
    System.out.println("HCF of "+a+" and "+b+" is : "+GCD(a, b));
    
}


}
