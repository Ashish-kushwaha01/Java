package Array;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter that how many no. do you have ? : ");
        n=sc.nextInt();

        int arr[]=new int [n];
         System.out.println("Enter your array elements : ");
        for(int i=0;i<n;i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(" Your array elements are  : ");
        for(int i=0;i<n;i++) {
            // System.out.print("Enter element "+(i+1)+" : ");
          System.out.print(arr[i]+"\s\s");
        }
        System.out.println("Which no. do you want to search ? : ");
        int k=sc.nextInt();

        for(int i=0;i<n;i++){
            if(k==arr[i]){
                System.out.println("Your index is : "+ i);
                continue;
            }
            // else {
            //     System.out.println("Your no. is not found in the array list ");
            //     break;
            // }
        }
    }
}
