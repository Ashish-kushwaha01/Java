package collegeActivity;
/* Switch case calculator . */

import java.util.Scanner;

public class Switch_Calculator {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first no. : " );
        n=sc.nextInt();
        System.out.print("Enter your second no.  : " );
        m=sc.nextInt();
        char ch1='+';
        char ch2='-';
        char ch3='*';
        char ch4='/';

        switch ('+'+ '-'+'*'+'/') {
            case '+': 
                System.out.print(n+m);
                break;
                case '-': 
                System.out.print(n-m);
                break;
                case '*': 
                System.out.print(n*m);
                break;
                case '/': 
                System.out.print(n/m);
                break;
        
            default:
                break;
        }
    }
    
}
