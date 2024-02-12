package Exercise;
/* Find greatest common divisor of given no.  */

import java.util.Scanner;

public class Divisor {
    public static int factor (int n ){
        for(int i=n;i>0;i--){
            if(n%i==0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first no. : ");
        a=sc.nextInt();
         System.out.println("Enter your second no. : ");
        b=sc.nextInt();
       
                if(factor(a)==factor(b)){

                }
            }
        }
        
    }
}
