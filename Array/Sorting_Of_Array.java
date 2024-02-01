package Array;

import java.util.Scanner;

public class Sorting_Of_Array {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("How many no. do you have ? : " );
    n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter your no. : ");
    for(int i=0;i<n;i++){
        System.out.print("No. "+(i+1)+" is : ");
         arr[i]=sc.nextInt();
    }

    System.out.println("Before sorting your elements are : ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+"\s\s");
    }
    System.out.println("\n\nAfter sorting your elements are : ");

    System.out.println("Ascending order of my elements are : ");
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
           
        }
        System.out.print(arr[i]+" \s\s");
    }

        System.out.println("\nDescending order of my elements are : ");
    for(int i=n-1;i>=0;i--){
        System.out.print(arr[i]+"\s\s");
    }
   } 
}
