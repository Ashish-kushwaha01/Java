package Array;

import java.util.Scanner;

/* Java Program to input and print n elements in an array */
public class Basic {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter that how many no. you have ? : ");
        n=sc.nextInt();

      int arr[] = new int [n];
        System.out.println("Enter your no. : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(" Your no. are : ");
        for(int i=0;i<n;i++){
            System.out.print (arr[i]+" \s");
    }
}
}
