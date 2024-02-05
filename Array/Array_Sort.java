package Array;

import java.util.Arrays;
import java.util.Scanner;

// Sorting of Array using built in function .
public class Array_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter that how many no. do you have  ? : ");
        n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter no. "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("After sorting my array is : ");
      System.out.println(Arrays.sort(arr, 0, n-1));
    }
}
