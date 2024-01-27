package collegeActivity;
// Tribonacci Series .

import java.util.Scanner;

public class tribonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("How many no. do you want to print ? : ");
        n=sc.nextInt();

        int a=0,b=1,c=1,d;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=1;i<=n-3;i++){
            d=a+b+c;
            System.out.print(d+" \s");
          a=b;
          b=c;
          c=d;
        }
    }
}
