package Array;

import java.util.Scanner;

public class Largest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many no. do you have ? : ");
        n=sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
            if(arr[i]<arr[0]){
                min=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Maximum no. is :"+max);
            System.out.println("Minimum no. is :"+min);
            break;
        }
    }
}
