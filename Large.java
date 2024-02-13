/* Java Program to find GCD (HCF) of Two Numbers . */

import java.util.Scanner;
class Large{

    
//   First Method Using Recursion .

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




public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a, b;
    System.out.println("Enter your first and second no. : ");
    a=sc.nextInt();
    b=sc.nextInt();

    System.out.println("HCF of "+a+" and "+b+" is : "+HCF(a, b));
    
    
}


}
