/* Java Program to find GCD (HCF) of Two Numbers . */

import java.util.Scanner;
class Large{
//     int a,b;
//     large(){

//     }
//     void show(int a , int b){
// if(a<b)
//         System.out.println(a);
    
//     else
//         System.out.println(b);
    
//     }
// }
// public class HCF {
//     public static void main(String[] args) {
//         int a,b,hcf;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your first no. : ");
//         a=sc.nextInt();
//         System.out.println("Enter your second no. : ");
//         b=sc.nextInt();
        
//         int temp1 = a;
//         int temp2 = b;
//         while(true){
//             if(a>b){
//             if(a%b==0){
//                 hcf=b;
//                 break;
                
//             }else{
//                 a=a%b;
//             }
//         }
//         else{
//             if(b%a==0){
//                 hcf = a;
//                 break;
//             }
//             else{
//                 b=b%a;
//             }
//         }
//         }
//         System.out.println("HCF of this two no. is : " +hcf);
//     }

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
    // System.out.println(HCF(a, b));
    
}


}
