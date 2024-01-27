package collegeActivity;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your no. : ");
        n=sc.nextInt();

        if(n>=0){
            if(n!=0){
                if(n%2==0){
                    System.out.println("Your no. is Even and Positive ");
                }
                else{
                    System.out.println("Your no. is Odd and Positive ");
                }
            }else{
                System.out.println("Your no. is neither Positive nor Negative ");
            }
           
        }
        else{
            System.out.println("Your no. is Negative ");
        }
    }
}
