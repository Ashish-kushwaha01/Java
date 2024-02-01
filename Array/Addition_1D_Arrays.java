package Array;

import java.util.Scanner;

public class Addition_1D_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("How many elements in your Array  : ");
        n=sc.nextInt();
    
        int arr[]= new int[n];
        int brr[]= new int[n];
        int sum[]= new int[n];
        System.out.println("Enter elements of your first array : ");
        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();

        }
        
        System.out.println("Enter elements of your second array : ");
        for(int i=0;i<n;i++){
                brr[i] = sc.nextInt();

        }
        
        System.out.println("Sum of your both matrix is : ");
        for(int i=0;i<n;i++){
                sum [i] = arr[i] + brr[i];
            System.out.print(sum[i]+" \s\s");
        }
        
    }
}
