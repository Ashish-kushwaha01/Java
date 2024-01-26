package Array;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter that how many no. you have ? : ");
        n=sc.nextInt();

        int arr[]=new int [n];
        System.out.println("Enter your numbers : ");
        for(int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        int k;
        System.out.println("Which no. do you want to search  ? : ");
        k=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.print("Index of my no. is : "+i);  // Index starts from 0;
            }
           
        }

    }
}