package Array;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many no. do you have ? : ");
        n=sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter no. "+(i+1)+" :  ");
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements are : "+arr[i]+"\s");

                }
            }
        }
    }
}
