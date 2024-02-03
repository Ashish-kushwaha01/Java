package Array;

import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter that how many no. you have ? : "); //Remember that no. start from 1 and these no. in sorted order .

        n=sc.nextInt();
        int arr[]=new int[n];

        int After_sum=0;

        for(int i =1;i<n;i++){
            System.out.print("Enter no. "+(i+1)+":");
            arr[i]=sc.nextInt();
            After_sum+=arr[i];
        }

        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=(i);
        }
        System.out.println("Missing no. is : "+(sum-After_sum));
    
       
        
        

    }
}
